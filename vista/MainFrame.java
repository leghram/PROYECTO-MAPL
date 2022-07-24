package vista;

import javax.swing.JFrame;

/**
 *Clase Tipo JFRAME para poder crear nuestra interfaz grafica
 */
public class MainFrame extends JFrame{
    
    PanelVista pv = new PanelVista();
    
    public MainFrame(){
        setVisible(true);
        setBounds(150,100,1600,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(pv);
        
    }
}
