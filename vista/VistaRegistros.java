
package vista;

import controlador.AdaptarVista;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *Clave de tipo JPanel en la que mostramos los registros y los objetos creados
 */

public class VistaRegistros extends JPanel{
    
    public static boolean miraRegistros = true;
    
    AdaptarVista evento;
    static JButton btnEnviar = new JButton("Enviar Registro");
    
    public VistaRegistros(){
        setLayout(null);
        setBounds(100,200,1200,600);
        setBackground(Color.CYAN);
        
        evento = new AdaptarVista(this);
        
        add(btnEnviar);
        btnEnviar.addActionListener(evento);
        btnEnviar.setBounds(500,540,200,50);
        btnEnviar.setVisible(false);
    }
    
    
    public static void VerFormulario(JPanel p){
        p.setBackground(Color.ORANGE);
        btnEnviar.setVisible(true);
        miraRegistros= false;
    }
    
    public static void VerRegistros(JPanel p){
        p.setBackground(Color.RED);
        btnEnviar.setVisible(false);
        miraRegistros =true;
    }
    
}
