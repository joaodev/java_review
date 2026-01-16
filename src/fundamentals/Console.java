package fundamentals;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        System.out.print("Good");
        System.out.print(" morning!%n%n");

        System.out.println("Lorem");
        System.out.println("Ipsum");

        System.out.printf("Numbers: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salary: %.1f%n", 1234.5678);
        System.out.printf("Name: %s%n", "John");

        Scanner userKeyboard = new Scanner(System.in);

        System.out.println("What is your age?");
        int userAge = userKeyboard.nextInt();
        userKeyboard.nextLine();

        System.out.println("What is your name?");
        String userName = userKeyboard.nextLine();

        System.out.println("What is you last name?");
        String userLastName = userKeyboard.nextLine();

        System.out.printf("Hello %s %s, you are %d years old.%n", userName, userLastName, userAge);
        userKeyboard.close();
    }
}
