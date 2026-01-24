package br.com.joaodev.streams.others;

public class AverageTest {

    public static void main(String[] args) {

        Average a1 = new Average().add(8.4).add(9.4);
        System.out.println(a1.getAverage());

        Average a2 = new Average().add(5.6).add(7.5);
        System.out.println(a2.getAverage());

        System.out.println(Average.combine(a1, a2).getAverage());
    }
}
