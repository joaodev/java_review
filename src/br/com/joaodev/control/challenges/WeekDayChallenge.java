package br.com.joaodev.control.challenges;

import java.util.Scanner;

public class WeekDayChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the week day:");
        String day = scanner.next();

        if (day.equalsIgnoreCase("sunday")) {
            System.out.println(1);
        } else if (day.equalsIgnoreCase("monday")) {
            System.out.println(2);
        } else if (day.equalsIgnoreCase("tuesday")) {
            System.out.println(3);
        } else if (day.equalsIgnoreCase("wednesday")) {
            System.out.println(4);
        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println(5);
        } else if (day.equalsIgnoreCase("friday")) {
            System.out.println(6);
        } else if (day.equalsIgnoreCase("saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Invalid day!");
        }

        scanner.close();
    }
}
