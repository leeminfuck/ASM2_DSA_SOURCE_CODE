/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM1;
import java.lang.IllegalArgumentException;

/**
 *
 * @author Lee Min Cun
 */
public class Student {
    private String name;
    private String phoneNumber;
    private String id;
    private float mark;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =  name;
    }
    
    public String getID(){
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    
    public float getMark(){
        return mark;
    }
    public void setMark(float mark){
if (mark < 0 || mark > 10) {
            throw new IllegalArgumentException("Marks should be between 0 and 10.");
        }
        this.mark = mark;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    private void setPhoneNumber(String phoneNumber){
         if (!phoneNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone number must be 10 digits.");
        }
        this.phoneNumber = phoneNumber;
    }
    
    public String getRanking(){
        if (mark < 5.0) return("Fail");
        else if (mark < 6.5) return("Medium");
        else if (mark < 7.5) return("Good");
        else if (mark < 9.0) return("Very Good");
        else return("Excelent");
    }
    
    public Student(String id, String name, float mark){
        this.id = id;
        this.name = name;
        this.mark = mark;
//        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return "Student ID: " + id + ", Name: " + name + ", Marks: " + mark + ", Ranking: " + getRanking() + ", Phone Number: " + phoneNumber;
    }
        public void updatePhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
    }

}

