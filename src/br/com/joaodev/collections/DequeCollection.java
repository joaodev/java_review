package br.com.joaodev.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeCollection {

    public static void main(String[] args) {

        Deque<String> books = new ArrayDeque<String>();

        books.add("Harry Potter");
        books.push("Lord of the Rings");
        books.push("The Hobbit");

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.pop());
        System.out.println(books.poll());
        System.out.println(books.poll());
    }
}
