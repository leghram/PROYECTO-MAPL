
package vista;

import controlador.AdaptarVista;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import modelo.AdaptadorBD;


/**
 *Clave de tipo JPanel en la que mostramos los registros y los objetos creados
 */

public class VistaRegistros extends JPanel{
    
    public static boolean miraRegistros = true;
   
    AdaptarVista evento;
    
    
    public VistaRegistros(){
        setLayout(null);
        setBounds(100,200,1200,600);
        setBackground(Color.CYAN);
        AdaptadorBD.LlenarRegistros(this);
        evento = new AdaptarVista(this);
        
    }
    
    
    public static void VerFormulario(JPanel p){
        p.setBackground(Color.ORANGE);
        PanelVista.btnEnviar.setVisible(true);
        miraRegistros= false;
    }
    
    public static void VerRegistros(JPanel p){
        p.setBackground(new Color(247,193,209));
        PanelVista.btnEnviar.setVisible(false);
        miraRegistros =true;
    }
    
}
