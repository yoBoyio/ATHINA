/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athina.formatters;

/**
 *
 * @author dimi44
 */
public class FormattedProfessorCourses {
    private String courseName;
    private int courseSemester;
    private String username;
    private String surname;
    private String name;
    private float grade;
    private String dateExamined;
    private String dateRegistered;
    
   
    public FormattedProfessorCourses(String courseName, int courseSemester) {
        this.courseName = courseName;
        this.courseSemester = courseSemester;
     
    }
    
    public String getCourseName() {
        return courseName;
    }

    public int getCourseSemester() {
        return courseSemester;
    }

    public String getUsername() {
        return username;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    public String getDateExamined() {
        return dateExamined;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }
    
}
