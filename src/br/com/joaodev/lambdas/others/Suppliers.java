package br.com.joaodev.lambdas.others;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args) {

        Supplier<List<String>> someList = () -> Arrays.asList("One", "Two", "Three", "Four");
        System.out.println(someList.get());
    }
}
