package br.com.joaodev.fundamentals.strings;

import javax.swing.*;
import java.math.BigDecimal;

public class StringNumberConversion {

    public static void main(String[] args) {

        String firstValue = JOptionPane.showInputDialog("Type a number:");
        String secondValue = JOptionPane.showInputDialog("Type another number:");

        System.out.println(firstValue + secondValue);

        double number1 = Double.parseDouble(firstValue);
        double number2 = Double.parseDouble(secondValue);

        double sum = number1 + number2;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / 2));

        BigDecimal bd = new BigDecimal(sum);
        System.out.println(bd.setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}
