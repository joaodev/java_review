package br.com.joaodev.fundamentals.others;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operation: +, -, *, / or %");
        String op = scanner.next();

        double result = "+".equals(op) ? num1 + num2 : 0;
        result = "-".equals(op) ? num1 - num2 : result;
        result = "*".equals(op) ? num1 * num2 : result;
        result = "/".equals(op) ? num1 / num2 : result;
        result = "%".equals(op) ? num1 % num2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, result);

        scanner.close();
    }
}
