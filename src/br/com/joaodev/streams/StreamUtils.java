package br.com.joaodev.streams;

import java.util.function.UnaryOperator;

public interface StreamUtils {

    public final static UnaryOperator<String> upperCase = n -> n.toUpperCase();
    public final static UnaryOperator<String> firstChar = n -> n.charAt(0) + "";

    public static String exclamation(String s) {
        return s + "!!! ";
    }
}
