package br.com.joaodev.streams.others;

public class Product {

    public final String name;
    public final double price;
    public final double discount;
    public final double transportTax;

    public Product(String name, double price, double discount, double transportTax) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.transportTax = transportTax;
    }
}
