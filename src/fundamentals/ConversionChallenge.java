package fundamentals;

import java.util.Scanner;

public class ConversionChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first salary:");
        String value1 = scanner.next().replace(",", ".");

        System.out.println("Type the second salary:");
        String value2 = scanner.next().replace(",", ".");

        System.out.println("Type the third salary:");
        String value3 = scanner.next().replace(",", ".");

        double salary1 = Double.parseDouble(value1);
        double salary2 = Double.parseDouble(value2);
        double salary3 = Double.parseDouble(value3);

        double average = (salary1 + salary2 + salary3) / 3;
        System.out.println("The salaries average is: " + average);

        scanner.close();
    }
}
