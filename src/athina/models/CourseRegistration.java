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
public class CourseRegistration {
    private Student student;
    private Course course;
    private String registrationSemester;
    private float grade;
    private Exam examined;
    private String dateRegistered;
    
    public CourseRegistration(Student student, Course course, String registrationSemester,String dateRegistered) {
        this.student = student;
        this.course = course;
        this.registrationSemester = registrationSemester;
        this.dateRegistered = dateRegistered;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setGrade(float grade) {
        this.grade = grade;
      
    }
    
    public void setDateExamined(Exam date) {
        this.examined = date;
    }
    
    public Exam getDateExamined() {
        return examined;
    }
    
    public String getDateRegistered() {
                return dateRegistered;
    }

    public float getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "CourseRegistration{" + "student=" + student + ", course=" + course + ", registrationSemester=" + registrationSemester + ", grade=" + grade + '}';
    }
}
