package control.loops;

public class WhileDeterminedLoop {

    static void main(String[] args) {

        int counter = 0;
        while (counter <= 20) {
            System.out.printf("i = %d\n", counter);
            counter += 2;
        }
    }
}
