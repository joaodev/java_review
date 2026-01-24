package br.com.joaodev.control.conditionals;

public class Break1Control {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("End!");
    }
}
