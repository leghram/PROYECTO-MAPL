
package vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModeloRegistro extends JPanel{
    
    public static int alturaInicio=0;
    
    JButton btnEditar = new JButton("Editar");
    JButton btnEliminar = new JButton("Eliminar");
    public JTextField id= new JTextField(), tipoNave= new JTextField(), descripcion= new JTextField(), velocidad= new JTextField(), fuenteEnergia= new JTextField(),tripulantes= new JTextField(),pais= new JTextField();
    
    
    public ModeloRegistro(){
        setLayout(null);
        setBounds(0,alturaInicio,1200,30);
        setBackground(Color.BLUE);
        
        btnEditar.setBounds(1040,2,80,26);
        btnEliminar.setBounds(1120,2,80,26);
        add(btnEditar);
        add(btnEliminar);
        
        id.setBounds(0,2,50,26);
        add(id);
        tipoNave.setBounds(50,2,200,26);
        add(tipoNave);
        descripcion.setBounds(250,2,300,26);
        add(descripcion);
        velocidad.setBounds(550,2,100,26);
        add(velocidad);
        fuenteEnergia.setBounds(650,2,200,26);
        add(fuenteEnergia);
        tripulantes.setBounds(850,2,90,26);
        add(tripulantes);
        pais.setBounds(940,2,100,26);
        add(pais);
                
        
        alturaInicio= alturaInicio+30;
    }
}
