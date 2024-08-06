/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Lee Min Cun
 */
public class labwork1 {
    public static void main(String[] args) {
    String nums[] = {"one","two","three","four","five" };
    Queue<String> queue = new LinkedList<>();
    Collections.addAll(queue, nums);
    System.out.println(queue); // [one, two, three, four, five]
    
//    Queue<String> queue = new LinkedList<>();
    queue.add("one");
    queue.add("two");
    queue.add("three");
    String strArray[] = queue.toArray(new String[queue.size()]);
    System.out.println(Arrays.toString(strArray)); // [one, two, three]
    }
}
