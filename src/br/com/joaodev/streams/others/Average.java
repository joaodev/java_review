package br.com.joaodev.streams.others;

public class Average {

    private double total;
    private int quantity;

    public Average add(double value) {
        total += value;
        quantity++;
        return this;
    }

    public double getAverage() {
        return total / quantity;
    }

    public static Average combine(Average a1, Average a2) {
        Average r = new Average();
        r.total = a1.total + a2.total;
        r.quantity = a1.quantity + a2.quantity;
        return r;
    }
}
