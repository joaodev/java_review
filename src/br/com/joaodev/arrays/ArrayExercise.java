package br.com.joaodev.arrays;

import java.util.Arrays;

public class ArrayExercise {

    public static void main(String[] args) {

        double[] studentGradesA = new double[4];
        System.out.println(Arrays.toString(studentGradesA));

        studentGradesA[0] = 10.0;
        studentGradesA[1] = 9.5;
        studentGradesA[2] = 8.5;
        studentGradesA[3] = 7.5;

        System.out.println(Arrays.toString(studentGradesA));
        System.out.println(studentGradesA[0]);
        System.out.println(studentGradesA[studentGradesA.length - 1]);

        double totalA = 0;
        for (int i = 0;  i < studentGradesA.length; i++) {
            totalA += studentGradesA[i];
        }

        System.out.println(totalA / studentGradesA.length);

        final double savedGrade = 5.9;
        double[] studentGradesB = {10.0, 5.5, savedGrade, 2.5};

        double totalB = 0;
        for (int i = 0; i < studentGradesB.length; i++) {
            totalB += studentGradesB[i];
        }

        System.out.println(totalB / studentGradesB.length);
    }
}
