package com.demo;
import java.util.LinkedList;
public class CreateQueue {
    private LinkedList<Integer> list = new LinkedList<>();

    // Enqueue operation
    public void enqueue(int data) {
        list.addLast(data); // Add data to the end of the LinkedList
    }

    // Display the elements of the queue
    public void display() {
        for (int element : list) {
            System.out.print(element + "->");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CreateQueue createQueue = new CreateQueue();

        // Enqueue elements into the queue
        createQueue.enqueue(56);
        createQueue.enqueue(30);
        createQueue.enqueue(70);

        // Display the queue
        System.out.println("Queue elements after enqueue operations:");
        createQueue.display();
    }
}
