package br.com.joaodev.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintingObjects {

    public static void main(String[] args) {

        List<String> students = Arrays.asList("John", "Peter", "Clark", "Gandalf");

        System.out.println("Using foreach...");
        for (String name: students) {
            System.out.println(name);
        }

        System.out.println("\nUsing Iterator...");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing Stream...");
        Stream<String> stream = students.stream();
        stream.forEach(System.out::println);
    }
}
