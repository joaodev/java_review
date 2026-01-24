package br.com.joaodev.lambdas.challenges;

import br.com.joaodev.lambdas.others.Product;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ProductChallenge {

    public static void main(String[] args) {

        Function<Product, Double> finalPrice = product -> product.price * (1 - product.discount);

        UnaryOperator<Double> municipalTax = price -> price >= 2500 ? price * 1.085 : price;

        UnaryOperator<Double> transportTax = price -> price >= 3000 ? price + 100 : price + 50;

        UnaryOperator<Double> rounded = price
                -> Double.parseDouble(String.format(Locale.US, "%.2f", price));

        Function<Double, String> formatted = price -> ("$" + price).replace(".", ",");

        Product p = new Product("Notebook", 1234.50, 0.1);

        String price = finalPrice
                .andThen(municipalTax)
                .andThen(transportTax)
                .andThen(rounded)
                .andThen(formatted)
                .apply(p);

        System.out.println("The final price is: " + price);
    }
}
