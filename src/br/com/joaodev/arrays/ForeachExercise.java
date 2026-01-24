package br.com.joaodev.arrays;

public class ForeachExercise {

    public static void main(String[] args) {

        double[] grades = {10.0, 7.5, 8.5};

        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }

        System.out.println();

        for (double grade : grades) {
            System.out.print(grade + " ");
        }
    }
}
