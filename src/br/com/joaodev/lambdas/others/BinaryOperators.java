package br.com.joaodev.lambdas.others;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperators {

    public static void main(String[] args) {

        BinaryOperator<Double> average = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(average.apply(6.7, 9.5));

        BiFunction<Double, Double, String> result = (n1, n2) -> {
            double finalGrade = (n1 + n2) / 2;
            return finalGrade >= 7 ? "Approved" : "Failed";
        };
        System.out.println(result.apply(9.7, 8.1));

        Function<Double, String> concept = av -> av >= 7 ? "Approved" : "Fail";
        System.out.println(average.andThen(concept).apply(9.4, 8.8));
    }
}
