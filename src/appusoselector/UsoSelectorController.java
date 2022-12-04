/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusoselector;

import componentes_santosalejandro.SelectorDeslizamiento;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Alejandro Santos Gutiérrez
 */
public class UsoSelectorController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private SelectorDeslizamiento componente1;
    @FXML
    private SelectorDeslizamiento componente2;
    
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
          componente1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                label.setText("Pulsado el selector de arriba");
            }
        });
        
        componente2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                label.setText("Pulsado el selector de abajo");
            }
        });
    }    
    
}
