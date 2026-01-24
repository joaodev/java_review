package br.com.joaodev.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MappingStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> brands = Arrays.asList("Audi", "BMW", "Ferrari");
        brands.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("\n\nUsing composition...");
        brands.stream()
                .map(StreamUtils.upperCase)
                .map(StreamUtils.firstChar)
                .map(StreamUtils::exclamation)
                .forEach(print);
    }
}
