package br.com.joaodev.fundamentals.operators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean condition1 = true;
        boolean condition2 = 3 > 7;

        System.out.println(condition1 && !condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 ^ condition2);
        System.out.println(!!condition1);
        System.out.println(!condition1);

        System.out.println("\nTruth table for AND (&&)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nTruth table for OR (||)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTruth table for XOR (^)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTruth table for NOT (!)");
        System.out.println(!true);
        System.out.println(!false);
    }
}
