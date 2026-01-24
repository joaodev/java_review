package br.com.joaodev.arrays.challenges;

import java.util.Scanner;

public class ArrayChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas: ");
        int gradesQuantity = scanner.nextInt();
        double [] grades = new double[gradesQuantity];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double total = 0;
        for (double grade : grades) {
            total += grade;
        }

        double average = total / grades.length;
        System.out.println("The grades average is: " + average);

        scanner.close();
    }
}
