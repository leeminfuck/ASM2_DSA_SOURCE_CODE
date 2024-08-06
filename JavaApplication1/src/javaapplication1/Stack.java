/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Lee Min Cun
 */
public class Stack {
    private int maxSize;      
    private int top;          
    private int[] stackArray; 
    
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; 
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot peek element.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top element is: " + stack.peek()); 
        System.out.println("Stack is empty: " + stack.isEmpty()); 
        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element is: " + stack.peek()); 
    }
}
