/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Lee Min Cun
 */
public class SinglyLinkList {

    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();
        
        myQueue.offer("Apple");
        myQueue.offer("Grapes");
        myQueue.offer("Mango");
        myQueue.offer("Orange");

        System.out.println("Queue: " + myQueue);
        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Size: " + myQueue.size());
        System.out.println("Is queue empty? " + myQueue.isEmpty());
    }
}
