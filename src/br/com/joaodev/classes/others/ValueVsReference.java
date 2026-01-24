package br.com.joaodev.classes.others;

import br.com.joaodev.classes.challenges.DateChallenge;

public class ValueVsReference {

    public static void main(String[] args) {

        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " " + b);

        DateChallenge d1 = new DateChallenge(21, 1, 2026);
        DateChallenge d2 = d1;

        d1.day = 31;
        d2.month = 12;
        d1.year = 2025;

        System.out.println(d1.formatDateEN());
        System.out.println(d2.formatDateEN());

        backToOriginalDate(d1);
        System.out.println(d1.formatDateBR());

        int c = 10;
        changePrimitive(c);
        System.out.println(c);
    }

    static void backToOriginalDate(DateChallenge date) {
        date.day = 1;
        date.month = 1;
        date.year = 1970;
    }

    static void changePrimitive(int a) {
        a++;
    }
}
