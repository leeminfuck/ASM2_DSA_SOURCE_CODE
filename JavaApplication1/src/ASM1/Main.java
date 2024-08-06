/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lee Min Cun
 */
public class Main {
    public static void main(String[] args){
        StudentInformationSystem system = new StudentInformationSystem();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Sort Student");
        System.out.println("5. Search Student by ID");
        System.out.println("6. Display All Students");
        System.out.println("Choose An Option: ");
        int option = scanner.nextInt();
        
        switch (option){
            case 1 -> system.addStudent();
            case 2 -> system.editStudent();
            case 3 -> system.delStudent();
            case 4 -> system.sortStudent();
            case 5 -> system.searchStudentByID();
            case 6 -> system.displayAllStudents();
            default -> System.out.println("Invalid optioin. Please try again");  
        }
        }
    }
}
