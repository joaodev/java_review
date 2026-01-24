package br.com.joaodev.streams.challenges;

import br.com.joaodev.streams.others.Product;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterChallenge {

    public static void main(String[] args) {

        Product p1 = new Product("Notebook 1", 1123.11, 0.0, 0);
        Product p2 = new Product("Notebook 2", 1223.22, 0.2, 0);
        Product p3 = new Product("Notebook 3", 1323.33, 0.3, 0);
        Product p4 = new Product("Notebook 4", 1423.44, 0.4, 0);
        Product p5 = new Product("Notebook 5", 1523.55, 0.5, 0);

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Product> predicate1 = p -> p.discount >= 0.3;
        Predicate<Product> predicate2 = p -> p.transportTax == 0;
        Predicate<Product> predicate3 = p -> p.price >= 500;

        Function<Product, String> message = p -> "Product: " + p.name + " with price: $" + p.price;

        products.stream()
                .filter(predicate1)
                .filter(predicate2)
                .filter(predicate3)
                .map(message)
                .forEach(System.out::println);
    }
}
