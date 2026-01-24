package br.com.joaodev.fundamentals.challenges;

public class LogicalChallenge {

    public static void main(String[] args) {

        // Works on Tuesday (V or F)
        // Works on Thursday (V or F)

        boolean work1 = true;
        boolean work2 = false;

        // Binary operator
        boolean buyTV50 = work1 && work2;
        boolean buyTV32 = work1 ^ work2;
        boolean buyIceCream = work1 || work2;

        // Unary operator
        boolean moreHealthy = !buyIceCream;

        System.out.println("Buy TV 50\"? " + buyTV50);
        System.out.println("Buy TV 32\"? " + buyTV32);

        System.out.println("Buy ice cream? " + buyIceCream);
        System.out.println("More healthy? " + moreHealthy);
    }
}
