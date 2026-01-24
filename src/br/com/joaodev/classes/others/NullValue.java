package br.com.joaodev.classes.others;

import br.com.joaodev.classes.challenges.DateChallenge;

public class NullValue {

    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!"));

        DateChallenge d1 = Math.random() > 0.5 ? new DateChallenge() : null;

        if (d1 != null) {
            d1.month = 12;
            System.out.println(d1.formatDateEN());
        }

        String s2 = Math.random() > 0.5 ? "Hello" : null;

        if (s2 != null) {
            System.out.println(s2.concat(" World!"));
        }
    }
}
