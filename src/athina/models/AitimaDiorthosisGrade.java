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
public class AitimaDiorthosisGrade {
    private  CourseRegistration courseRegistration;
    private Professor professor;
    private  float  grade;
    
    public AitimaDiorthosisGrade(CourseRegistration courseRegistration,Professor professor,float  grade){
        this.courseRegistration=courseRegistration;
        this.professor=professor;
        this.grade=grade;
    }

    public CourseRegistration getCourseRegistration() {
        return courseRegistration;
    }

    public void setCourseRegistration(CourseRegistration courseRegistration) {
        this.courseRegistration = courseRegistration;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    
    
}
