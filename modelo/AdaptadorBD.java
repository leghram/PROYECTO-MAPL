
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPanel;
import vista.ModeloRegistro;

public class AdaptadorBD {
    static String rutaBD = "jdbc:mysql://localhost:3306/NAVESESPACIALES";
    
    static Connection acceso;
    static ResultSet registrosObtenidos;
    static Statement ejecutor;
    
    static boolean permiso = false;
    static String consulta;
    
    public static void Conecta(){
        try{
            acceso =DriverManager.getConnection(rutaBD,"root","");
            System.out.println("SE ESTABLECIO LA CONECCION");
            
            ejecutor = acceso.createStatement();
            System.out.println("SE CREO LA CONSULTA");       
        }catch(Exception e){
            System.out.println("NO SE PUDO OBTENER LA CONEXION");
        }
    }
    
    public static void LlenarRegistros(JPanel panel){
        ModeloRegistro modelo = new ModeloRegistro();
        ModeloRegistro.alturaInicio =0;
        try{
            Conecta();
            registrosObtenidos = ejecutor.executeQuery("SELECT * FROM NAVES");
            System.out.println("SE OBTUVO LSO REGISTROS");
            while(registrosObtenidos.next()){
                modelo.id.setText(registrosObtenidos.getString(1));
                modelo.tipoNave.setText(registrosObtenidos.getString(2));
                modelo.descripcion.setText(registrosObtenidos.getString(3));
                modelo.velocidad.setText(registrosObtenidos.getString(4));
                modelo.fuenteEnergia.setText(registrosObtenidos.getString(5));
                modelo.tripulantes.setText(registrosObtenidos.getString(6));
                modelo.pais.setText(registrosObtenidos.getString(7));
                panel.add(modelo);
             }
            acceso.close();
        }catch(Exception e){
            System.out.println("NO SE PUDO CONECTAR");
        }
    }
    
    
    
    
    
    public static void ObtenerRegistros(JPanel panel){
        ModeloRegistro modelo = new ModeloRegistro();
        ModeloRegistro.alturaInicio =0;
        try{
            Conecta();
            registrosObtenidos = ejecutor.executeQuery("SELECT * FROM NAVES");
            System.out.println("SE OBTUVO LSO REGISTROS");
            while(registrosObtenidos.next()){
                modelo.id.setText(registrosObtenidos.getString(1));
                modelo.tipoNave.setText(registrosObtenidos.getString(2));
                modelo.descripcion.setText(registrosObtenidos.getString(3));
                modelo.velocidad.setText(registrosObtenidos.getString(4));
                modelo.fuenteEnergia.setText(registrosObtenidos.getString(5));
                modelo.tripulantes.setText(registrosObtenidos.getString(6));
                modelo.pais.setText(registrosObtenidos.getString(7));
                panel.add(modelo);
             }
            acceso.close();
        }catch(Exception e){
            System.out.println("NO SE PUDO CONECTAR");
        }
    }
    
    
    public static void ObtenerNuevoID(){
        String nuevoID="";
        int numID=0;
        try {
            Conecta();
            registrosObtenidos = ejecutor.executeQuery("SELECT * FROM NAVES");
            while(registrosObtenidos.next()){
                nuevoID= registrosObtenidos.getString(1);
                numID = Integer.parseInt(nuevoID.substring(4));
                System.out.println(" " + numID);
            }
            numID++;
            nuevoID="NAVE"+numID;
            System.out.println(" " + nuevoID);
            acceso.close();
        } catch (Exception e) {
        System.out.println("NO SE PUDO CONECTAR");
        }
    }
    
    
}
