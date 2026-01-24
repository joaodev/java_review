package br.com.joaodev.control.conditionals;

public class Break2Control {

    public static void main(String[] args) {

        external:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break external;
                }
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }

        System.out.println("End!");
    }
}
