package br.com.joaodev.control.conditionals;

import java.util.Scanner;

public class Switch2Control {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grade: ");
        int grade = scanner.nextInt();
        String concpet = "";

        switch (grade) {
            case 10: case 9: {
                concpet = "Concept A";
                System.out.println("High grade!");
                break;
            }
            case 8: case 7:
                concpet = "Concept B";
                break;
            case 6: case 5:
                concpet = "Concept C";
                break;
            case 4:
            case 3:
            case 2:
            case 1:
                concpet = "Concept D";
                break;
            default:
                concpet = "Invalid grade";
        }

        System.out.println("Result is: " + concpet);

        scanner.close();
    }
}
