package br.com.joaodev.control.challenges;

import java.util.Scanner;

public class WhileChallange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantityOfGrades = 0;
        double grade = 0;
        double total = 0;

        while (grade != -1) {
            System.out.println("Enter a grade or -1 to finish:");
            grade = scanner.nextDouble();

            if (grade <= 10 && grade >= 0) {
                total += grade;
                quantityOfGrades++;
            } else if (grade != -1) {
                System.out.println("Invalid grade!");
            }
        }

        double average = total / quantityOfGrades;
        System.out.println("Average is: " + average);

        scanner.close();
    }
}
