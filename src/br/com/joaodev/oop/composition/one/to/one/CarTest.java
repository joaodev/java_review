package br.com.joaodev.oop.composition.one.to.one;

public class CarTest {

    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println("Car started: " + c1.isRunning());

        c1.start();
        System.out.println("Car started: " + c1.isRunning());
        System.out.println("Car speed: " + c1.engine.revolutions());

        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        System.out.println("Car speed after accelerate: " + c1.engine.revolutions());

        c1.brake();
        c1.brake();
        c1.brake();
        System.out.println("Car speed after brake: " + c1.engine.revolutions());

        c1.stop();
        System.out.println("Car stopped: " + c1.isRunning());
    }
}
