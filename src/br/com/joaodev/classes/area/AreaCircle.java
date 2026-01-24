package br.com.joaodev.classes.area;

public class AreaCircle {

    double radius;
    static final double PI = 3.1415;

    AreaCircle(double initialRadius) {
        radius = initialRadius;
    }

    double area() {
        return PI * Math.pow(radius, 2);
    }

    static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }
}

