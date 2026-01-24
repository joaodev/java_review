package br.com.joaodev.classes.challenges;

public class DateTestChallenge {

    public static void main(String[] args) {

        DateChallenge d1 = new DateChallenge(21, 1, 2026);

        var d2 = new DateChallenge();
        d2.day = 21;
        d2.month = 1;
        d2.year = 2026;

        DateChallenge d3 = new DateChallenge();
        d3.day = 21;
        d3.year = 2026;

        String date1 = d1.formatDateEN();

        System.out.println(date1);
        System.out.println(d2.formatDateBR());
        System.out.println(d3.formatDateEN());

        System.out.println();

        d1.printDateEN();
        d2.printDateBR();
        d3.printDateEN();
    }
}
