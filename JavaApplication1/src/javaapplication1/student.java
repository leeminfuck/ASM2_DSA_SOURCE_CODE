/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Lee Min Cun
 */
public class student {
    public String name;
    public int age;
    
    public student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void print_info(){
        System.out.println("This is the student's name " + this.name);
        System.out.println("This is the student's age " + this.age);
    
    }
    public static void main(String[] args){
        student student1 = new student("Phuc", 19);
        student1.print_info();
    }
}
