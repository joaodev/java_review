package br.com.joaodev.control.loops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = "";

        do {
            System.out.println("You need to say the magic words...");
            System.out.println("Want to exit, type 'exit'");
            text = scanner.nextLine();
        } while (!text.equalsIgnoreCase("exit"));

        System.out.println("Thanks for using the app!");
        scanner.close();
    }
}
