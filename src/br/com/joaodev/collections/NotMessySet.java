package br.com.joaodev.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NotMessySet {

    public static void main(String[] args) {

        SortedSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Peter");
        names.add("Anna");

        for (String name : names) {
            System.out.println(name);
        }

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
