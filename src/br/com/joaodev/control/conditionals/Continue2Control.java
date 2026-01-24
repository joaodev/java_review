package br.com.joaodev.control.conditionals;

public class Continue2Control {

    public static void main(String[] args) {

        external:
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 1) {
                    continue external;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();
        }

        System.out.println("End!");
    }
}
