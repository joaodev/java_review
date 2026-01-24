package br.com.joaodev.lambdas.interfaces;

@FunctionalInterface
public interface Calculation {

    double execute(double a, double b);

    default String printMessage() {
        return "Calculation in progress...";
    }

    static String finalMessage() {
        return "Calcutation done.";
    }
}
