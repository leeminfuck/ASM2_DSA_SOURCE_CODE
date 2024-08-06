/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author Lee Min Cun
 */
public class test4 {
     public static void main(String[] args) {
        Queue<String> animal2 = new ArrayDeque<>();
        animal2.add("Lion");
        animal2.add("Tiger");
        animal2.add("Elephant");
        
        System.out.println("Front element: " + animal2.peek()); 
        System.out.println("Removed element: " + animal2.remove()); 
        System.out.println("Removed element: " + animal2.remove()); 
 
        animal2.add("Giraffe");
        
        System.out.println("Removed element: " + animal2.remove());
        System.out.println("Removed element: " + animal2.remove()); 
        System.out.println("Is the queue empty? " + animal2.isEmpty()); 
    }     
}
