package br.com.joaodev.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // When the queue is full, the next element is removed
        queue.add("John"); // Throws exception if fails
        queue.offer("Peter"); // Returns false if fails
        queue.add("Mary");
        queue.offer("Ipsum");
        queue.add("Lorem");
        queue.offer("Dolor");

        // When the queue is empty, the next element is removed
        System.out.println(queue.peek()); // Returns null if fails
        System.out.println(queue.peek());
        System.out.println(queue.element()); // Throws exception if fails
        System.out.println(queue.element());

        // queue.size());
        // queue.clear();
        // queue.isEmpty();

        // When the queue is empty, the next element is removed
        System.out.println(queue.poll()); // Returns null if fails
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.remove()); // Throws exception if fails
        System.out.println(queue.poll());
    }
}
