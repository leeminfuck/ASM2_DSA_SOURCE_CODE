/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Lee Min Cun
 */
public class animal{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your width: ");
        float width = sc.nextFloat();
        
        System.out.println("Enter your height: ");
        float height = sc.nextFloat();
        
        float c = (width + height)*2;
        float s = width * height;
                
        System.out.println("This is your name " + s);
        System.out.println("This is your name " + c);
        
    }
}

