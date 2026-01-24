package br.com.joaodev.lambdas.tests;

import java.util.function.BinaryOperator;

public class Calculation3Test {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(7.0, 8.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(5.0, 6.0));

        BinaryOperator<Integer> calc2 = (x, y) -> {
            return x + y;
        };
        System.out.println(calc2.apply(3, 5));

        calc2 = (x, y) -> x * y;
        System.out.println(calc2.apply(2, 6));
    }
}
