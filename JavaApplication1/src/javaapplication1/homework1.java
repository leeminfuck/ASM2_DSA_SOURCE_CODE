/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

/**
 *
 * @author Lee Min Cun
 */
public class homework1 {
    public static void main(String[] args){
//        Stack<Integer> stk = new Stack();
//        
//        stk.push(10);
//        stk.push(15);
//        stk.push(20);
//        
//        for (Integer integer : stk){
//            System.out.println(integer + " - ");
//        }
//        
//        stk.pop();
//        
//        System.out.println("");
//        for (Integer integer : stk){
//            System.out.println(integer + " - ");
//        }

        Queue<Integer> q = new LinkedList<>();
    
        q.add(15);
        q.offer(20);
        
        for(Integer integer : q){
            System.out.println(integer);
        
        }
        q.remove();
        System.out.println("--------");
        for (Integer integer : q){
            System.out.println(integer);
        }
    }
    
}
