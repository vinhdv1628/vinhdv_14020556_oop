/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinhd
 */
public class Student {
    
    private String name, id, group, email;

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setId(String id){this.id = id;}
    public String getId(){return id;}
    
    public void setGroup(String group){this.group = group;}
    public String getGroup(){return group;}
    
    public void setEmail(String email){this.email = email;}
    public String getEmail(){return email;}
    
    public String getInfo(){
 //     System.out.println(name + " - " + id + " - " + group + " - " + email);
        return (name + " - " + id + " - " + group + " - " + email);
    }
    
    public  Student(){
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }
    
    public Student(String name, String id, String email){
        group = "K62CB";
    }
    
    public Student(Student s){};
    
    public static void main (String[] args){
        Student stest = new Student();
        stest.setName("Nguyen Van An");
        stest.setId("17020001");
        stest.setGroup("K62CC");
        stest.setEmail("17020001@vnu.edu.vn");
        stest.getInfo();
    }
    
    
    
}
