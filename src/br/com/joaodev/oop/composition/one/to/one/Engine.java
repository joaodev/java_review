package br.com.joaodev.oop.composition.one.to.one;

public class Engine {

    final Car car;
    boolean running = false;
    double injectionFactor = 1;

    Engine(Car car) {
        this.car = car;
    }

    int revolutions() {
        if (!running) {
            return 0;
        } else {
            return (int) Math.round(injectionFactor * 3000);
        }
    }
}
