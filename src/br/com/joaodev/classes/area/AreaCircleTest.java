package br.com.joaodev.classes.area;

public class AreaCircleTest {

    public static void main(String[] args) {

        AreaCircle a1 = new AreaCircle(10);
        a1.radius = 100;

        AreaCircle a2 = new AreaCircle(5);
        a2.radius = 200;

        System.out.println(a1.area());
        System.out.println(a2.area());
        System.out.println(AreaCircle.area(10));

        System.out.println(AreaCircle.PI);
        System.out.println(Math.PI);
    }
}
