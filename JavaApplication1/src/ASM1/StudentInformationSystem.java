/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
/**
 *
 * @author Lee Min Cun
 */
public class StudentInformationSystem{
    private final List<Student> students;
    private final Scanner scanner;
    public StudentInformationSystem(){
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void addStudent(){
        try {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                throw new IllegalArgumentException("ID cannot be empty.");
            }

            for (Student student : students) {
                if (student.getID().equals(id)) {
                    throw new IllegalArgumentException("Student ID already exists.");
                }
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }

            System.out.print("Enter Student Marks: ");
            float marks = Float.parseFloat(scanner.nextLine());

            if (marks < 0 || marks > 10) {
                throw new IllegalArgumentException("Marks should be between 0 and 10.");
            }
            
            System.out.print("Enter Student Phone Number: ");
            String phoneNumber = scanner.nextLine();
            if (phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")){
                throw new IllegalArgumentException("Phone number must be exactly 10 numeric digits."); 
            }
            
            students.add(new Student(id, name, marks));
            System.out.println("Student added successfully.");
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric value for marks.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }  
    }
    public void editStudent(){
         try {
            System.out.print("Enter Student ID to edit: ");
            String id = scanner.nextLine();
            Student studentToEdit = null;

            for (Student student : students) {
                if (student.getID().equals(id)) {
                    studentToEdit = student;
                    break;
                }
            }

            if (studentToEdit == null) {
                throw new IllegalArgumentException("Student ID not found.");
            }

            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            if (newName.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }

            System.out.print("Enter new marks: ");
            float newMarks = Float.parseFloat(scanner.nextLine());

            if (newMarks < 0 || newMarks > 10) {
                throw new IllegalArgumentException("Marks should be between 0 and 10.");
            }

            studentToEdit.setName(newName);
            studentToEdit.setMark(newMarks);

            System.out.println("Student information updated successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric value for marks.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void sortStudent(){
        students.sort(Comparator.comparing(Student::getMark).reversed());
        System.out.println("Students sorted by marks in descending order");   
    }
    
    public void searchStudentById() {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getID().equals(id)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public void delStudent(){
        System.out.println("Enter Student ID to delete: ");
        String id = scanner.nextLine();
        boolean removed = students.removeIf(student -> student.getID().equals(id));
        if (removed){
            System.out.println("Student deleted successfully");
        } else {
            System.out.println("Student not found.");
        }
    }
    public void searchStudentByID(){
        System.out.println("Enter Student ID to search: ");
        String id = scanner.nextLine();
        for (Student student : students){
            if (student.getID().equals(id)){
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found");
    }
    public void displayAllStudents(){
    if (students.isEmpty()){
        System.out.println("No Students to display");
    } else{
        for (Student student : students){
            System.out.println(student);
        }
    }
    }
    
}
