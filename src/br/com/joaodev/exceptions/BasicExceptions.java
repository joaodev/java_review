package br.com.joaodev.exceptions;

import br.com.joaodev.exceptions.others.Student;

public class BasicExceptions {

    public static void main(String[] args) {

        Student s1 = null;

        try {
            printStudentName(s1);
        } catch (Exception e) {
            System.out.println("Error printing the student's name");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("End!");
    }

    public static void printStudentName(Student student) {
        System.out.println(student.name);
    }
}
