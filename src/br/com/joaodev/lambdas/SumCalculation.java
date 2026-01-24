package br.com.joaodev.lambdas;

import br.com.joaodev.lambdas.interfaces.Calculation;

public class SumCalculation implements Calculation {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
