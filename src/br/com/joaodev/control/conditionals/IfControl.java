package br.com.joaodev.control.conditionals;

import java.util.Scanner;

public class IfControl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grade: ");
        double grade = scanner.nextDouble();

        if (grade <= 10  && grade >= 7.0) {
            System.out.println("Approved");
            System.out.println("Congratulations!");
        }

        if (grade < 7 && grade >= 4.5)
            System.out.println("Recovery");

        boolean failureGrade = grade < 4.5 && grade >= 0;
        if (failureGrade) {
            System.out.println("Failed");
        }

        scanner.close();
    }
}
