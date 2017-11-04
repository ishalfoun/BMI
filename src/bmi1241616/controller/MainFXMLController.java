/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi1241616.controller;

import bmi1241616.model.Person;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author 1241616
 */
public class MainFXMLController implements Initializable {

    private Person person;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
    @FXML
    private void handleCalculate(ActionEvent event) {
        
    }
    
    
    public void setBean(Person person) throws SQLException {
        this.person = person;
    }

}
