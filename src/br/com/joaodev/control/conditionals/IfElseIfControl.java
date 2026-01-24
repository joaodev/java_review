package br.com.joaodev.control.conditionals;

import java.util.Scanner;

public class IfElseIfControl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade:");

        double grade = scanner.nextDouble();

        if (grade > 10 || grade < 0) {
            System.out.println("Invalid grade");
        } else if (grade >= 8.1) {
            System.out.println("Concept A");
        } else if (grade >= 6.1) {
            System.out.println("Concept B");
        } else if (grade >= 4.1) {
            System.out.println("Concept C");
        } else if (grade >= 2.1) {
            System.out.println("Concept D");
        } else {
            System.out.println("Concept E");
        }

        scanner.close();
    }
}
