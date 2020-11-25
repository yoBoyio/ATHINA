/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athina.controllers;

import athina.Account;
import static athina.Account.requestNewGrade;
import athina.Athina;
import athina.models.AitimaDiorthosisGrade;
import athina.models.Course;
import athina.models.CourseRegistration;
import athina.models.Professor;
import formatters.FormattedProfessorCourses;
import formatters.FormattedRequest;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dimi44
 */
public class AdminApprovalPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
      @FXML
    private TableView<FormattedRequest> approvalTable;
    @FXML
    private TableColumn<FormattedRequest, String> professorCol;
     @FXML
    private TableColumn<FormattedRequest, String> studentCol;
    @FXML
    private TableColumn<FormattedRequest, Float> oldGradeCol;
    @FXML
    private TableColumn<FormattedRequest, Float> newGradeCol;
    @FXML
    private TableColumn<FormattedRequest, String> examCol;
    @FXML
    private  Label errorLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         professorCol.setCellValueFactory(new PropertyValueFactory<>("professorName"));
       studentCol.setCellValueFactory(new PropertyValueFactory<>("studentName"));
       oldGradeCol.setCellValueFactory(new PropertyValueFactory<>("oldGrade"));
       newGradeCol.setCellValueFactory(new PropertyValueFactory<>("newGrade"));
       examCol.setCellValueFactory(new PropertyValueFactory<>("examCol"));
       ArrayList <AitimaDiorthosisGrade> reng =  Account.getRequests();     
       approvalTable.setItems(formattedRequests(reng));
                
    } 
    //
     private ObservableList<FormattedRequest> formattedRequests (ArrayList<AitimaDiorthosisGrade> request) {  
        ObservableList<FormattedRequest> list = FXCollections.observableArrayList();
        String proffessorName = "";
        String studentName = "";
        float oldGrade = 0;
        float newGrade = 0;
        String exam="";
        CourseRegistration cr;
        for(AitimaDiorthosisGrade req: request){
            proffessorName = req.getProfessor().getUsername();
            studentName=req.getCourseRegistration().getStudent().getAM();
            oldGrade=req.getCourseRegistration().getGrade();
            newGrade=req.getGrade();
            exam=req.getExam().getId();
            list.add(new FormattedRequest(proffessorName, studentName,oldGrade,newGrade,exam));
        }
        
        return list;
    }
    public void backButtonPressed(ActionEvent event) {
        try{
            Scene scene = new Scene (FXMLLoader.load(getClass().getResource("/athina/views/MasterPage.fxml")));
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.setResizable(false);
            window.setTitle("Athina");
            window.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public  void approvePressed(ActionEvent event){
           FormattedRequest formattedRequest= approvalTable.getSelectionModel().getSelectedItem();
           if(formattedRequest==null){
               errorLabel.setText("Επιλεξτε μια διορθωση");
           }

      }
}
