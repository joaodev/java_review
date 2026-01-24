package br.com.joaodev.control.loops;

public class For3Loop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }

            System.out.println();
        }
    }
}
