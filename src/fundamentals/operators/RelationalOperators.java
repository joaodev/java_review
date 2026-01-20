package fundamentals.operators;

public class RelationalOperators {

    static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println('\u0061'); // a

        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        double grade = 7.3;
        boolean goodBehavior = true;
        boolean passedByGrade = grade >= 7;
        boolean haveDiscount = goodBehavior && passedByGrade;

        System.out.println("Have discount? " + haveDiscount);
    }
}
