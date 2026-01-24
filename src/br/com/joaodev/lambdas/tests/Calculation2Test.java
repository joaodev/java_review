package br.com.joaodev.lambdas.tests;

import br.com.joaodev.lambdas.interfaces.Calculation;

public class Calculation2Test {

    public static void main(String[] args) {

        Calculation calc = (x, y) -> { return x + y; };
        System.out.println(calc.printMessage());
        System.out.println(calc.execute(7, 8));

        calc = (x, y) -> x * y;
        System.out.println(calc.execute(5, 6));

        System.out.println(Calculation.finalMessage());
    }
}
