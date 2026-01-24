package br.com.joaodev.streams;

import br.com.joaodev.streams.filters.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxStream {

    public static void main(String[] args) {

        Student s1 = new Student("Rogers", 9.5);
        Student s2 = new Student("Jonson", 6.1);
        Student s3 = new Student("Parker", 8.1);
        Student s4 = new Student("Bilbo", 10);
        Student s5 = new Student("Gandalf", 9.6);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

        Comparator<Student> bestGrade = (student1, student2) -> {
            if (student1.grade > student2.grade) return 1;
            if (student1.grade < student2.grade) return -1;
            return 0;
        };

        Comparator<Student> worseGrade = (student1, student2) -> {
            if (student1.grade > student2.grade) return -1;
            if (student1.grade < student2.grade) return 1;
            return 0;
        };

        System.out.println(students.stream().max(bestGrade).get());
        System.out.println(students.stream().min(worseGrade).get());

        System.out.println(students.stream().min(bestGrade).get());
        System.out.println(students.stream().max(worseGrade).get());
    }
}
