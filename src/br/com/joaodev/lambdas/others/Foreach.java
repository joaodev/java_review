package br.com.joaodev.lambdas.others;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> students = Arrays.asList("John", "Peter", "Clark");

        System.out.println("Traditional way...");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("\nLambda #01");
        students.forEach(student -> System.out.println(student));

        System.out.println("\nMethod reference #01");
        students.forEach(System.out::println);

        System.out.println("\nLambda #02");
        students.forEach(student -> printName(student));

        System.out.println("\nMethod reference #02");
        students.forEach(Foreach::printName);
    }

    static void printName(String name) {
        System.out.println("My name is: " + name);
    }
}
