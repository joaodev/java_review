package br.com.joaodev.control.conditionals;

public class Continue1Control {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }
    }
}
