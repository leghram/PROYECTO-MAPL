
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import vista.PanelVista;
import vista.VistaRegistros;


/**
 * Implementamos la clase de tipo evento para poder adaptar GUI al usuarios
 */

public class AdaptarVista implements ActionListener{
    
    JPanel panel;

    public AdaptarVista(JPanel panel){
        super();
        this.panel = panel;
    }
    
    public void actionPerformed(ActionEvent evento){
        if(VistaRegistros.miraRegistros){
            VistaRegistros.VerFormulario(panel);
            PanelVista.btnBuscar.setEnabled(false);
            PanelVista.btnAgregar.setText("VOLVER");
        }else{
            VistaRegistros.VerRegistros(panel);
            PanelVista.btnBuscar.setEnabled(true);
            PanelVista.btnAgregar.setText("AGREGAR NUEVO");
        }
    }
}
