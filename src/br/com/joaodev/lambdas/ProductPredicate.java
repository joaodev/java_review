package br.com.joaodev.lambdas;

import br.com.joaodev.lambdas.others.Product;

import java.util.function.Predicate;

public class ProductPredicate {

    public static void main(String[] args) {

        Predicate<Product> isExpensive = prod
                -> (prod.price * (1 - prod.discount)) >= 750;

        Product product = new Product("Notebook", 1233.12, 0.1);
        System.out.println(isExpensive.test(product));
    }
}
