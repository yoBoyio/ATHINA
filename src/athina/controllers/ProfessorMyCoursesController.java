/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athina.controllers;

import athina.Account;
import athina.Athina;
import athina.models.CourseRegistration;
import athina.models.Professor;
import  athina.models.Course;
import formatters.FormattedProfessorCourses;
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
public class ProfessorMyCoursesController implements Initializable {
    
    
    /**
     * Initializes the controller class.
     */
    @FXML
    private TableView<FormattedProfessorCourses> tableCourse;
    @FXML
    private TableColumn<FormattedProfessorCourses, String> courseCol;
    @FXML
    private TableColumn<FormattedProfessorCourses, Integer> semesterCol;
    @FXML
    private  Label examLbl;
    @FXML
    private  TableView<FormattedProfessorCourses> tableExams;
    @FXML
    private TableColumn<FormattedProfessorCourses, String> typeColumn;
      @FXML
    private TableColumn<FormattedProfessorCourses, String> yearColumn;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        courseCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));
       semesterCol.setCellValueFactory(new PropertyValueFactory<>("courseSemester"));
       
       Professor professor = (Professor)Account.professors[0];
       //Professor professor = (Professor)Athina.user;
       ArrayList <Course> myCourses = professor.getCoursesTaught();
       tableCourse.setItems(formattCourses(myCourses));
       tableCourse.getSortOrder().add(semesterCol);
       tableExams.setVisible(false);
       examLbl.setVisible(false);
    }    
    
    private ObservableList<FormattedProfessorCourses> formattCourses (ArrayList<Course> courses) {
        
        ObservableList<FormattedProfessorCourses> list = FXCollections.observableArrayList();
        String name = "";
        int semester = 0;
        
        for(Course r: courses){
            name = r.getName();
            semester = r.getSemester();
            
            list.add(new FormattedProfessorCourses(name, semester));
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
     
    public void displayExamsCourse(ActionEvent event){
               // ObservableList<FormattedProfessorCourses> list = FXCollections.observableArrayList();
         FormattedProfessorCourses formattedProfessorCourses= tableCourse.getSelectionModel().getSelectedItem();
         
         if (formattedProfessorCourses==null){
             examLbl.setText("Επελεξτε μαθημα");
         }else{
             examLbl.setVisible(true);
             tableExams.setVisible(true);

             String name  = formattedProfessorCourses.getCourseName();
             
         }
         
    }
}

