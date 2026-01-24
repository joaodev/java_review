package br.com.joaodev.control.conditionals;

import javax.swing.*;

public class IfElseControl {

    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog("Type a number:");
        int number = Integer.parseInt(value);

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
