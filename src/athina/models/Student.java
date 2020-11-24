/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athina.models;

import java.util.ArrayList;

/**
 *
 * @author dimi44
 */
public class Student extends User{
     private int currentSemester;
    private String dateEnrolled;
    private  String am;
    
    public Student(String username,String password, String firstName,
        String lastName,int currentSemester,String am) {
        super(username, password, firstName, lastName);
        this.currentSemester = currentSemester;
        this.am = am;
    }
    
    /*public ArrayList<CourseRegistration> getRegistrations(){
        int i=0;
        ArrayList <CourseRegistration> currentRegistrations=new ArrayList<>();
        
    }*/
    
    public String getAM(){
        return am;
    }
     public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }
}
