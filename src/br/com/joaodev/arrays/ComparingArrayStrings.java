package br.com.joaodev.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComparingArrayStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        // Your code here
        String longestString = Arrays.stream(sentence.split(" "))
                .filter(s -> !s.isBlank())
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(longestString);
        scanner.close();
    }
}
