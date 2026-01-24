package br.com.joaodev.lambdas.others;

import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {

        Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "Even" : "Odd";
        System.out.println(evenOrOdd.apply(10));

        Function<String, String> result = value -> "The result is: " + value;
        Function<String, String> exclamations = value -> value + "!!!";

        String finalResult = evenOrOdd
                .andThen(result)
                .andThen(exclamations)
                .apply(42);

        System.out.println(finalResult);
    }
}
