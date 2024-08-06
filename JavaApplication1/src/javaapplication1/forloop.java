/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Lee Min Cun
 */
public class forloop {
    public static void main(String[] args){
        int[] a = {2, 4, 6, 8, 10};
    
        for (int i : a){
            System.out.println(i);
        }
        
        for (int i = 0; i < a.length; i ++){
            System.out.println("index: " + i);
            System.out.println(a[i]);
        }
    }
}
