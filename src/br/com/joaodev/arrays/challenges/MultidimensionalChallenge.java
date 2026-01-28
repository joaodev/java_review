package br.com.joaodev.arrays.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        int[][] transposedArray = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
                transposedArray[j][i] = array[i][j];
            }
        }
        System.out.println(Arrays.deepEquals(array, transposedArray) ? "YES" : "NO");
    }
}
