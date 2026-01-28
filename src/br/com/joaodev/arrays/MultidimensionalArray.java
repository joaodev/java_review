package br.com.joaodev.arrays;

import java.util.Arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {

        int[][] twoDimArray1 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        int[][] twoDimArray2 = {
                {0, 0},       // the length is 2
                {1, 2, 3, 4}, // the length is 4
                {3, 3, 3}     // the length is 3
        };

        int number = twoDimArray2[1][2]; // it is 3
        System.out.println(number);

        /**
         * Working with 2D arrays
         * In the previous examples, we were creating 2D arrays by enumerating all the elements. But one of the most
         * popular ways to create a multidimensional array is using a for loop.
         */
        int[][] twoDimArray3 = new int[2][10];
        for (int i = 0; i < twoDimArray3.length; i++) {
            for (int j = 0; j < twoDimArray3[i].length; j++) {
                twoDimArray3[i][j] = 1;
            }
        }

        for (int i = 0; i < twoDimArray3.length; i++) {
            System.out.println(Arrays.toString(twoDimArray3[i]));
        }

        System.out.println();

        for (int[] ints : twoDimArray3) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println();

        for (int i = 0; i < twoDimArray3.length; i++) {
            for (int j = 0; j < twoDimArray3[i].length; j++) {
                twoDimArray3[i][j]++;
                System.out.print(twoDimArray3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        /**
         * Multidimensional arrays (>2)
         */
        int[][][] threeDimArray = new int[2][3][4];
        int element = 0;

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    threeDimArray[i][j][k] = element;
                }
                element++;
            }
        }

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                System.out.print(Arrays.toString(threeDimArray[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println(threeDimArray[0][0][0]); // 0
        System.out.println(threeDimArray[0][1][0]); // 1
        System.out.println(threeDimArray[1][0][1]); // 3
        System.out.println(threeDimArray[1][2][3]); // 5 – the last element of the last array
    }
}
