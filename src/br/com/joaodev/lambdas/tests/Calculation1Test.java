package br.com.joaodev.lambdas.tests;

import br.com.joaodev.lambdas.MultiplyCalculation;
import br.com.joaodev.lambdas.SumCalculation;
import br.com.joaodev.lambdas.interfaces.Calculation;

public class Calculation1Test {

    public static void main(String[] args) {

        Calculation calculation = new SumCalculation();
        System.out.println(calculation.execute(5, 6));

        calculation = new MultiplyCalculation();
        System.out.println(calculation.execute(12, 4));
    }
}
