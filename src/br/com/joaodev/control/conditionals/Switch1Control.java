package br.com.joaodev.control.conditionals;

public class Switch1Control {

    public static void main(String[] args) {
        String faixa = "black";

        switch (faixa.toLowerCase()) {
            case "black":
                System.out.println("Black belt");
            case "brown":
                System.out.println("Brown belt");
            case "purple":
                System.out.println("Purple belt");
            case "green":
                System.out.println("Green belt");
            case "orange":
                System.out.println("Orange belt");
            case "red":
                System.out.println("Red belt");
            case "yellow":
                System.out.println("Yellow belt");
            case "white":
                System.out.println("White belt");
            default:
                System.out.println("Invalid belt color");
                break;
        }

        System.out.println();

        int age = 3;
        switch (age) {
            case 3:
                System.out.println("Can dance");
            case 2:
                System.out.println("Can speak");
            case 1:
                System.out.println("Can walk");
            default:
                System.out.println("First year");
        }

        System.out.println("End!");
    }
}
