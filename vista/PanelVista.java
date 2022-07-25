package vista;

import controlador.AdaptarVista;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *Esta es la clase principal de tipo JPanel que muestra la disposion entera para que el usuario pueda acceder a los datos
 */

public class PanelVista  extends JPanel{
    
    VistaRegistros vistaRegistros = new VistaRegistros();
    
    public static JButton btnBuscar= new JButton("BUSCAR O FILTRAR");
    public static JButton btnAgregar = new JButton("AGREGAR NUEVO");
    static JButton btnEnviar = new JButton("Enviar Registro");
    
    JLabel id=new JLabel("ID");
    JLabel tipoNave=new JLabel("TIPO NAVE"),descripcion=new JLabel("DESCRIPCION"),velocidad=new JLabel("VELOCIDAD"),fuenteEnergia=new JLabel("FUENTE ENERGIA"),tripulantes=new JLabel("TRIPULANTES"),pais=new JLabel("PAIS");
    
    AdaptarVista evento = new AdaptarVista(vistaRegistros);
    
    
    public PanelVista(){
        setLayout(null);
        setBounds(0,0,1600,900);
        setBackground(Color.GREEN);
        
        btnAgregar.addActionListener(evento);
        btnAgregar.setBounds(1350,470,200,60);
        add(btnAgregar);
        
        btnBuscar.setBounds(600,20,200,50); 
        add(btnBuscar);
        
        add(btnEnviar);
        add(vistaRegistros);
        
        
        btnEnviar.addActionListener(evento);
        btnEnviar.setBounds(600,750,200,50); 
        btnEnviar.setVisible(false);
        
        EstablecerUbicacion();
        add(id);
        add(tipoNave);
        add(descripcion);
        add(velocidad);
        add(fuenteEnergia);
        add(tripulantes);
        add(pais);
    
    }
    
    
    public void EstablecerUbicacion(){
            id.setBounds(100,150,50,50);
            tipoNave.setBounds(150,150,200,50);
            descripcion.setBounds(350,150,300,50);
            velocidad.setBounds(650,150,100,50);
            fuenteEnergia.setBounds(750,150,200,50);
            tripulantes.setBounds(950,150,90,50);
            pais.setBounds(1040,150,100,50);
    }
    
    public void AgregarEtiquetas(){
        this.add(id);
        this.add(tipoNave);
        this.add(descripcion);
        this.add(velocidad);
        this.add(fuenteEnergia);
        this.add(tripulantes);
        this.add(pais);
    }
    
}
