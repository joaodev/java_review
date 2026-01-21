package classes.challenges;

public class DateTestChallenge {

    public static void main(String[] args) {

        DateChallenge d1 = new DateChallenge();
        d1.day = 21;
        d1.month = 1;
        d1.year = 2026;

        var d2 = new DateChallenge();
        d2.day = 21;
        d2.month = 1;
        d2.year = 2026;

        System.out.printf("%d-%d-%d\n", d1.year, d1.month, d1.day);
        System.out.printf("%d/%d/%d", d2.day, d2.month, d2.year);
    }
}
