package com.demo;
import java.util.LinkedList;
public class StackOperations {
    private LinkedList<Integer> list = new LinkedList<>();

    // Push operation
    public void push(int data) {
        list.addFirst(data); // Add data to the beginning of the LinkedList
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst(); // Return the top element without removing it
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst(); // Remove and return the top element
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Display the elements of the stack
    public void display() {
        for (int element : list) {
            System.out.print(element + "->");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackOperations stackOperations = new StackOperations();

        // Push elements onto the stack
        stackOperations.push(56);
        stackOperations.push(30);
        stackOperations.push(70);

        // Display the stack
        System.out.println("Stack elements after push operations:");
        stackOperations.display();

        // Peek and pop until the stack is empty
        System.out.println("Peek and pop operations:");
        while (!stackOperations.isEmpty()) {
            System.out.println("Peek: " + stackOperations.peek());
            System.out.println("Pop: " + stackOperations.pop());
            System.out.println("Stack after pop:");
            stackOperations.display();
        }
    }
}
