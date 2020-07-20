/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinhd
 */
import java.util.ArrayList;
public class StudentManagement { 
    
    ArrayList students = new ArrayList();
    
/*  public String studentsByGroup(){
        
    }*/
    
    
    public static boolean sameGroup(Student s1, Student s2){
        if ((s1.getGroup() == s2.getGroup())){return true;} 
        else {return false;}    
    }
    
    
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.getGroup();
        s2.getGroup();
    
    }
    
    public void addStudent(Student newStudent){
        
    students.add("Nguyen Van A - 123456788 - K62CC");
    }
    
    

 

    
    
    
}
