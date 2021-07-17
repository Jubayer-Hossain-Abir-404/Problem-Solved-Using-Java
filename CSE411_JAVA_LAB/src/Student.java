/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABIR
 */
public class Student {
    
    private String id;
    private String name;
    private double cgpa;

    public Student() {
    }

    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    

    public Student(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    
    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
    
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setId("2022-1-60-100");
        s1.setName("Karim");
        s1.setCgpa(3.9);
        
        String sid= s1.getId();
        String sname= s1.getName();
        double scgpa=s1.getCgpa();
        
        System.out.println("id = "+sid);
        System.out.println("name = "+sname);
        System.out.println("cgpa = "+scgpa);
        
        Student s2= new Student("2022-1-60-123","Xman",3.85);
        
        s2.setCgpa(3.9);
        
         
    }
}
