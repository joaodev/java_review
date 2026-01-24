package br.com.joaodev.streams.filters;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Student s1 = new Student("John", 7.4, true);
        Student s2 = new Student("Gandalf", 9.4, true);
        Student s3 = new Student("Bilbo", 8.9, true);
        Student s4 = new Student("Peter", 9.4, true);
        Student s5 = new Student("Frodo", 5.2, false);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

        Predicate<Student> isApproved = s -> s.grade > 7 && s.goodBehavior;
        Function<Student, String> message = s -> "Congratulations " + s.name + ", you are approved!";

        students.stream()
                .filter(isApproved)
                .map(message)
                .forEach(System.out::println);
    }
}
