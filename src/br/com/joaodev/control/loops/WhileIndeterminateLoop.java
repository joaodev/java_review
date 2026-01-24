package br.com.joaodev.control.loops;

import java.util.Scanner;

public class WhileIndeterminateLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String value = "";

        while (!value.equalsIgnoreCase("Hello")) {
            System.out.println("Type Hello:");
            value = scanner.nextLine();
        }

        scanner.close();
    }
}
