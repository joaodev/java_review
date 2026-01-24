package br.com.joaodev.exceptions;

public class CheckedVsNotChecked {

    public static void main(String[] args) {

        try {
            generateError1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        generateError2();

        try {
            generateError3();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        try {
            generateError4();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End!");
    }

    // Not Checked
    static void generateError1() {
        throw new RuntimeException("An error occurred (#1).");
    }

    // Checked
    static void generateError2() {
        try {
            throw new Exception("An error occurred (#2).");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Checked
    static void generateError3() throws Exception {
        throw new Exception("An error occurred (#3)");
    }

    static void generateError4() throws RuntimeException {
        throw new RuntimeException("An error occurred (#4)");
    }
}
