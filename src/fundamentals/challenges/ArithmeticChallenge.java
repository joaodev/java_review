package fundamentals.challenges;

public class ArithmeticChallenge {

    static void main(String[] args) {

        double numA = Math.pow(6 * (3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double topA = numA / denA;
        double topB = Math.pow(numB / denB, 2);

        double top = Math.pow(topA - topB, 3);
        double bottom = Math.pow(10, 3);

        double result = top / bottom;

        System.out.println("The result is: " + result);
    }
}
