package br.com.joaodev.streams.reducers;

import br.com.joaodev.streams.filters.Student;
import br.com.joaodev.streams.others.Average;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

        Student s1 = new Student("John", 7.1);
        Student s2 = new Student("Peter", 6.1);
        Student s3 = new Student("Parker", 8.1);
        Student s4 = new Student("Bilbo", 10);
        Student s5 = new Student("Gandalf", 9.6);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

        Predicate<Student> approved = s -> s.grade >= 7;
        Function<Student, Double> onlyGrade = s -> s.grade;

        BiFunction<Average, Double, Average> averageCalc = (a, g) -> a.add(g);
        BinaryOperator<Average> combineAverage = (a1, a2) -> Average.combine(a1, a2);

        Average average = students.parallelStream()
                .filter(approved)
                .map(onlyGrade)
                .reduce(new Average(), averageCalc, combineAverage);

        System.out.println("The average is: " + average.getAverage());
    }
}
