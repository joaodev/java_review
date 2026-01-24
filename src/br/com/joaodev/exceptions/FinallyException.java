package br.com.joaodev.exceptions;

import java.util.Scanner;

public class FinallyException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(7 / scanner.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("End!");
        }
    }
}
