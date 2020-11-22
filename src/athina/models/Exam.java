/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athina.models;

/**
 *
 * @author dimi44
 */
public class Exam {
    
    private Course [] courses;
    private String year;
    private String type;

    public Exam (Course course,String date, String type){
        this.year=date;
        this.type=type;
        addCourses(course);
    }
    public Exam (String date, String type){
        this.year=date;
        this.type=type;
        
    }
    public Course[] getCourses() {
        return courses;
    }

    public void addCourses(Course course) {
        for(int i=0;i<courses.length;i++)
            if( courses==null ){
             courses[i] = course;
             break;
            }   
    }

    public String getDate() {
        return year;
    }

    public void setDate(String date) {
        this.year = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
