package vista;

import controlador.AdaptarVista;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *Esta es la clase principal de tipo JPanel que muestra la disposion entera para que el usuario pueda acceder a los datos
 */

public class PanelVista  extends JPanel{
    
    VistaRegistros vistaRegistros = new VistaRegistros();
    
    public static JButton btnBuscar= new JButton("BUSCAR O FILTRAR");
    public static JButton btnAgregar = new JButton("AGREGAR NUEVO");
    
    AdaptarVista evento = new AdaptarVista(vistaRegistros);
    
    public PanelVista(){
        setLayout(null);
        setBounds(0,0,1600,900);
        setBackground(Color.GREEN);
        
        add(vistaRegistros);
        
        btnAgregar.addActionListener(evento);
        btnAgregar.setBounds(1350,470,200,60);
        add(btnAgregar);
        
        btnBuscar.setBounds(600,20,200,50);
        add(btnBuscar);
        
    }
}
