package br.com.joaodev.arrays.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students?");
        int studentsQuantity = scanner.nextInt();

        System.out.println("How many grades by student?");
        int gradesQuantity = scanner.nextInt();

        double[][] classGrades = new double[studentsQuantity][gradesQuantity];
        double total = 0;

        for (int s = 0; s < classGrades.length; s++) {
            for (int g = 0; g < classGrades[s].length; g++) {

                System.out.printf("Enter the grade %d for student %d: ", s + 1, g + 1);
                classGrades[s][g] = scanner.nextDouble();
                total += classGrades[s][g];
            }
        }

        double average = total / (studentsQuantity * gradesQuantity);
        System.out.println("The average is: " + average);

        for (double[] studentGrades : classGrades) {
            System.out.println(Arrays.toString(studentGrades));
        }

        scanner.close();
    }
}
