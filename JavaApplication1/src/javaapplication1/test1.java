/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Lee Min Cun
 */
public class test1 {
    public static void main(String[] args) {
        int number = 3;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    
    }
}
