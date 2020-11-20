/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athina.controllers;

import athina.Athina;
import athina.models.Admin;
import athina.models.Professor;
import athina.models.Student;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author dimi44
 */
public class MasterPageController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label usernameLabel;
    @FXML
    Button loginBtn;      
    @FXML
    Button manageGradesBtn;
   @FXML
    Button logoutBtn;
    @FXML
    AnchorPane pane;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     /*if (Athina.user instanceof Student) {
            pane.getChildren().remove(loginBtn);
            usernameLabel.setText(Athina.user.getUsername());
            //pane.getChildren().remove(manageCoursesButton);
            //pane.getChildren().remove(regPrintButton);
        } else if (Athina.user instanceof Professor) {
           
            pane.getChildren().remove(loginBtn);
            usernameLabel.setText(Athina.user.getUsername());
        }else if (Athina.user instanceof Admin) {
            pane.getChildren().remove(loginBtn);
            usernameLabel.setText(Athina.user.getUsername());
    }else {
            pane.getChildren().remove(manageGradesBtn);
            pane.getChildren().remove(logoutBtn);


        }*/
    }
    public void loginButtonPressed(ActionEvent event) {
        try{
            Scene loginScene = new Scene (FXMLLoader.load(getClass().getResource("/athina/views/LoginScene.fxml")));
            Athina.user=null;
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(loginScene);
            window.setResizable(false);
            window.setTitle("Athina - Login");
            window.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }    
    }
    
     public void logoutButtonPressed(ActionEvent event) {
        try{
            Athina.user=null;
            Scene loginScene = new Scene (FXMLLoader.load(getClass().getResource("/athina/views/LoginScene.fxml")));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(loginScene);
            window.setResizable(false);
            window.setTitle("Athina - Login");
            window.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }    
    }
     
     public void myCourses(ActionEvent event){
        
        try{
            Scene courses = new Scene (FXMLLoader.load(getClass().getResource("/athina/views/ProfessorMyCourses.fxml")));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(courses);
            window.setResizable(false);
            window.setTitle("Athina - Τα μαθήματά μου");
            window.show();
        }
        catch(IOException e){
            e.printStackTrace();
            }  
        }
}
