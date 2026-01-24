package br.com.joaodev.streams.others;

import br.com.joaodev.streams.filters.Student;

import java.util.Arrays;
import java.util.List;

public class OtherUsages {

    public static void main(String[] args) {

        Student s1 = new Student("Bart", 9.5);
        Student s2 = new Student("Jonson", 6.1);
        Student s3 = new Student("Parker", 8.1);
        Student s4 = new Student("Bilbo", 10);
        Student s5 = new Student("Gandalf", 9.6);
        Student s6 = new Student("Rogers", 9.5);
        Student s7 = new Student("Jonson", 6.1);
        Student s8 = new Student("Parker", 8.1);
        Student s9 = new Student("Bilbo", 10);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9);

        System.out.println("distinct...");
        students.stream().distinct().forEach(System.out::println);

        System.out.println("\nskip/limit");
        students.stream()
                .distinct()
                .limit(2)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        students.stream()
                .distinct()
                .skip(2)
                .takeWhile(s -> s.grade >= 7)
                .forEach(System.out::println);
    }
}
