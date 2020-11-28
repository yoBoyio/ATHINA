/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athina.controllers;

import athina.Account;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class CoursesStudentController implements Initializable {
    @FXML
    private AnchorPane mathhmataPanel;
    @FXML
    private ListView mathhmataList=new ListView();

    private boolean firstTimeTwo=true;
    /**
     * Initializes the controller class.
     */
    @Override

    public void initialize(URL url, ResourceBundle rb) {        
        if (firstTimeTwo){
=======
    public void initialize(URL url, ResourceBundle rb) {
        
       if (firstTimeTwo){

            for (int i =0; i< Account.courses.length; i++){
                if (Account.courses[i] != null )
                    mathhmataList.getItems().add(Account.courses[i]);
            }
        }
        firstTimeTwo = false;
    }  
    
    
    public void backButtonPressed(ActionEvent event) {
        try {
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/athina/views/MasterPage.fxml")));
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.setTitle("Athina");
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
