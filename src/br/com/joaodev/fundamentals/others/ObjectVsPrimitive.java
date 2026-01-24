package br.com.joaodev.fundamentals.others;

public class ObjectVsPrimitive {

    public static void main(String[] args) {

        String s = "some text here";
        var toUpper = s.toUpperCase();
        System.out.println(toUpper);

        System.out.println();

        // Wrappers are the object of primitive types
        int a = 10;
        System.out.println(a);
    }
}
