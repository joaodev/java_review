package br.com.joaodev.control.loops;

public class WhileDeterminedLoop {

    public static void main(String[] args) {

        int counter = 0;
        while (counter <= 20) {
            System.out.printf("i = %d\n", counter);
            counter += 2;
        }
    }
}
