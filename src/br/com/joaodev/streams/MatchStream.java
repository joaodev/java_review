package br.com.joaodev.streams;

import br.com.joaodev.streams.filters.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchStream {

    public static void main(String[] args) {

        Student s1 = new Student("John", 7.1);
        Student s2 = new Student("Peter", 6.1);
        Student s3 = new Student("Parker", 8.1);
        Student s4 = new Student("Bilbo", 10);
        Student s5 = new Student("Gandalf", 9.6);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
        Predicate<Student> approved = s -> s.grade >= 7;
        Predicate<Student> failed = approved.negate();

        System.out.println(students.stream().allMatch(approved));
        System.out.println(students.stream().anyMatch(approved));
        System.out.println(students.stream().noneMatch(failed));
    }
}
