package fundamentals.numbers;

public class NumericPrimitiveTypeConversion {

    public static void main(String[] args) {

        double a = 1; // IMPLICIT CAST
        System.out.println(a);

        float b = (float) 1.1234567; // EXPLICIT CAST
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // EXPLICIT CAST
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // EXPLICIT CAST
        System.out.println(f);
    }
}
