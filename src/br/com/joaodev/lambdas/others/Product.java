package br.com.joaodev.lambdas.others;

public class Product {

    public final String name;
    public final double price;
    public final double discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        double finalPrice = price * (1 - discount);
        return String.format("Product: %s with price: $%.2f", name, finalPrice);
    }
}
