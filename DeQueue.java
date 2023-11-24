package com.demo;
import java.util.LinkedList;
public class DeQueue {
    private LinkedList<Integer> list = new LinkedList<>();

    // Enqueue operation
    public void enqueue(int data) {
        list.addLast(data); // Add data to the end of the LinkedList
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst(); // Remove and return the element from the beginning
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Display the elements of the queue
    public void display() {
        for (int element : list) {
            System.out.print(element + "->");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeQueue deQueue = new DeQueue();

        // Enqueue elements into the queue
        deQueue.enqueue(56);
        deQueue.enqueue(30);
        deQueue.enqueue(70);

        // Display the queue
        System.out.println("Queue elements after enqueue operations:");
        deQueue.display();

        // Dequeue until the queue is empty
        System.out.println("Dequeue operations:");
        while (!deQueue.isEmpty()) {
            System.out.println("Dequeue: " + deQueue.dequeue());
            System.out.println("Queue after dequeue:");
            deQueue.display();
        }
    }
}
