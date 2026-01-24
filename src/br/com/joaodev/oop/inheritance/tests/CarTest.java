package br.com.joaodev.oop.inheritance.tests;

import br.com.joaodev.oop.inheritance.challenges.Ferrari;
import br.com.joaodev.oop.inheritance.challenges.HondaFit;

public class CarTest {

    public static void main(String[] args) {

        HondaFit car1 = new HondaFit();

        car1.accelerate();
        System.out.println(car1);
        car1.accelerate();
        car1.brake();
        System.out.println(car1);
        car1.accelerate();
        System.out.println(car1);

        Ferrari c2 = new Ferrari(400);

        c2.accelerate();
        System.out.println(c2);

        c2.turnOnTurbo();
        c2.turnOnAirConditioning();

        c2.accelerate();
        c2.accelerate();
        c2.brake();
        System.out.println(c2);

        System.out.println(c2.airLevel());

        c2.turnOffTurbo();
        c2.accelerate();
        c2.accelerate();
        System.out.println(c2);

        c2.turnOffAirConditioning();
        c2.accelerate();
        c2.accelerate();
        System.out.println(c2);

        c2.brake();
        System.out.println(c2);
    }
}
