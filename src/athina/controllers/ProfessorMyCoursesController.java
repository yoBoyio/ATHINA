/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athina.controllers;

import athina.Athina;
import athina.formatters.FormattedProfessorCourses;
import athina.models.CourseRegistration;
import athina.models.Professor;
import  athina.models.Course;
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
    private TableView<FormattedProfessorCourses> gradesTable;
    @FXML
    private TableColumn<FormattedProfessorCourses, String> courseCol;
    @FXML
    private TableColumn<FormattedProfessorCourses, Integer> semesterCol;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      //  gradesTableCourse.setCellValueFactory(new PropertyValueFactory<>("courseName"));
       //gradesTableSemester.setCellValueFactory(new PropertyValueFactory<>("courseSemester"));
//       
//       Professor professor = (Professor)Athina.user;
//       ArrayList <Course> myCourses = professor.getCoursesTaught();
//       gradesTable.setItems(formatCourseses(myCourses));
//       gradesTable.getSortOrder().add(gradesTableSemester);
    }    
    
    private ObservableList<FormattedProfessorCourses> formatCourseses (ArrayList<Course> courses) {
        
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
    
}
