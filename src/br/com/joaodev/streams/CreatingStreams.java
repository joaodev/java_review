package br.com.joaodev.streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;
        // Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java", "Kotlin", "Go\n");
        langs.forEach(print);

        String[] moreLangs = { "C", "C++", "Python\n" };

        Stream.of(moreLangs).forEach(print);
        Arrays.stream(moreLangs).forEach(print);
        Arrays.stream(moreLangs, 1, 2).forEach(print);

        List<String> anotherLang = Arrays.asList("PHP", "TypeScript\n");
        anotherLang.stream().forEach(print);
        anotherLang.parallelStream().forEach(print);

        // Stream.generate(() -> "a").forEach(print);
        // Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
