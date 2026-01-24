package br.com.joaodev.lambdas.others;

import java.util.function.UnaryOperator;

public class UnaryOperators {

    public static void main(String[] args) {

        UnaryOperator<Integer> sumTwo = n -> n + 2;
        UnaryOperator<Integer> multiplyTwo = n -> n * 2;
        UnaryOperator<Integer> toSquare = n -> n * n;

        int result1 = sumTwo
                .andThen(multiplyTwo)
                .andThen(toSquare)
                .apply(0);

        System.out.println(result1);

        int result2 = toSquare
                .compose(multiplyTwo)
                .compose(sumTwo)
                .apply(0);

        System.out.println(result2);
    }
}
