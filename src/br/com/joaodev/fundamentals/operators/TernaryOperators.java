package br.com.joaodev.fundamentals.operators;

public class TernaryOperators {

    public static void main(String[] args) {

        double studentGrade = 7.6;
        String partialResult = studentGrade >= 5.0 ? "recovery" : "failed";
        String finalResult = studentGrade >= 7.0 ? "approved": partialResult;
        System.out.println("The student was " + finalResult + ".");

        double grade = 7.3;
        boolean goodBehavior = true;
        boolean passedByGrade = grade >= 7;
        boolean haveDiscount = goodBehavior && passedByGrade;

        String result = haveDiscount ? "Yes" : "No";
        System.out.printf("Have discount? %s%n", result);
    }
}
