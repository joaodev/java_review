package br.com.joaodev.lambdas.others;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {

    public static void main(String[] args) {

        Consumer<Product> print = p -> System.out.println(p.name);

        Product p1 = new Product("Pen", 12.32, 0.9);
        print.accept(p1);

        Product p2 = new Product("Notebook", 80, 0.9);
        Product p3 = new Product("Pencil", 4.50, 0.9);
        Product p4 = new Product("Rubber", 2.1, 0.9);

        List<Product> products = Arrays.asList(p1, p2, p3, p4);

        products.forEach(print);
        products.forEach(p -> System.out.println(p.price));
        products.forEach(System.out::println);
    }
}
