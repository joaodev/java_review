package br.com.joaodev.classes.challenges;

public class InstanceChallenge {

    int a = 3;
    static int b = 5;

    public static void main(String[] args) {

        InstanceChallenge ic = new InstanceChallenge();
        System.out.println(ic.a);

        System.out.println(b);
    }
}
