package com.demo;

import java.util.Stack;
import java.util.LinkedList;

public class CreateStack {
    private LinkedList<Integer> list = new LinkedList<>();

    // Push operation
    public void push(int data) {
        list.addFirst(data); // Add data to the beginning of the LinkedList
    }

    // Display the elements of the stack
    public void display() {
        for (int element : list) {
            System.out.print(element + "->");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CreateStack createStack = new CreateStack();

        // Push elements onto the stack
        createStack.push(56);
        createStack.push(30);
        createStack.push(70);

        // Display the stack
        System.out.println("Stack elements after push operations:");
        createStack.display();
    }

}
