
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import modelo.AdaptadorBD;

import vista.ModeloRegistro;
import vista.PanelVista;
import vista.VistaRegistros;


/**
 * Implementamos la clase de tipo evento para poder adaptar GUI al usuarios
 */

public class AdaptarVista implements ActionListener{
    
    JPanel panel;
    static int distancia =0;

    public AdaptarVista(JPanel panel){
        super();
        this.panel = panel;
    }
    
    public void actionPerformed(ActionEvent evento){
        AdaptadorBD.LlenarRegistros(panel);
        
        
        if(VistaRegistros.miraRegistros){
            ModeloRegistro.alturaInicio = 0;
            panel.removeAll();
            
            panel.setVisible(false);
            PanelVista.panelAgregarRegistro.setVisible(true);
            
            VistaRegistros.VerFormulario(panel);
            PanelVista.btnBuscar.setEnabled(false);
            PanelVista.btnAgregar.setText("VOLVER");
        }else{
            PanelVista.panelAgregarRegistro.setVisible(false);
            panel.setVisible(true);
            
            VistaRegistros.VerRegistros(panel);
            PanelVista.btnBuscar.setEnabled(true);
            PanelVista.btnAgregar.setText("AGREGAR NUEVO");
        }
    }
}
