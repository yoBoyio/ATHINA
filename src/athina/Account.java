/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athina;
import  athina.models.*;
/**
 *
 * @author dimi44
 */
public class Account {
    public static User[] users;
    public static Student[] students;
    public static Professor[] professors;
    public static Admin[] admins;
    public static Course[] courses;
    public static CourseRegistration[] registrations;
    public static Exam[] exams;
    public static  AitimaDiorthosisGrade requestNewGrade[];
    
    public Account() {
        students = new Student[50];
        professors = new Professor[20];
        admins = new Admin[10];
        courses = new Course[30];
        registrations = new CourseRegistration[50];
        exams= new Exam[10];
        requestNewGrade=new AitimaDiorthosisGrade[10];
    }
    
    public void initializeData(){
        students[0] = new Student("aalexiou","123", "Alexis", "Alexiou",3 ,"173903");
        students[1] = new Student("ddimitriou","123", "Dimitris", "Dimitriou",5 ,"165306");
        students[2] = new Student("nnikou", "123","Nikos", "Nikou",3, "185401");
        
        professors[0] = new Professor("vkostogl","123", "Vasileios", "Kostoglou");
        professors[1] = new Professor("idel", "123","Ignatios", "Deligianis");
        professors[2] = new Professor("stoug", "123","Stefanos", "Ougiaroglou");
        
            admins[0] = new Admin("gkakou", "123","Georgia", "Kakou");
        
        courses[0] = new Course("072", "Epixeirisiaki Ereuna", 6, 7, professors[0]);
        courses[1] = new Course("023", "Antikeimenostrefis Programmatismos", 6, 2, professors[1]);
        courses[2] = new Course("071", "Mhxaniki Logismikou", 6,7, professors[1]);
        courses[3] = new Course("044", "Sxediash Leitourgikwn Systimatwn", 6, 4, professors[2]);
        
        registrations[0] = new CourseRegistration(students[0], courses[0], "2018-19 ΕΑΡ","20/5/2019");
        registrations[1] = new CourseRegistration(students[1], courses[1], "2018-19 XEIM","20/11/2020");
        registrations[2] = new CourseRegistration(students[2], courses[2], "2018-19 ΕΑΡ","20/5/2019");
        registrations[3] = new CourseRegistration(students[2], courses[3], "2018-19 XEIM","20/11/2020");
        
        
        
        exams[0]= new Exam("2019", "Β ΕΑΡ","EB1");
        exams[1] = new Exam("2019","Α XEIM","AX1");
        exams[2] = new Exam( "2020","Α ΕΑΡ","AE3");
        exams[3] = new Exam( "2019","Α ΕΑΡ","AE2"); 
        exams[4]= new Exam("2018", "Α ΕΑΡ","AE1");
        
        registrations[1].setGrade(5);
        
        exams[0].setCourse(courses[1]);
        exams[4].setCourse(courses[1]);
        exams[1].setCourse(courses[2]);
        

    }
    public static void newRequest(AitimaDiorthosisGrade request) {
        for (int i=0; i<requestNewGrade.length; i++){
            if (requestNewGrade[i] == null)
                requestNewGrade[i] = request;
        }
    }
    
  
    public static Course[] getFullCourse() {
        Course fullCourse[]=new Course[30];
        int i =0;
        for(Course course : courses){
            
            if (course == null)
                break;
            fullCourse[i] = course;
            i++;
               
        }
        return fullCourse;
    }
    
    private static boolean courseExists(String id)
    {
        for(Course course : courses)
        {
            if (course == null)
                break;
            
            if (course.getId().equals(id))
                return true;
        }
        return false;
    }
    
}
