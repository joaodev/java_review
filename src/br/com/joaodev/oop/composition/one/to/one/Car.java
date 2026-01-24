package br.com.joaodev.oop.composition.one.to.one;

public class Car {

    final Engine engine;

    Car() {
        this.engine = new Engine(this);
    }

    void start() {
        engine.running = true;
    }

    void accelerate() {
        if (engine.injectionFactor < 2.6) {
            engine.injectionFactor += 0.4;
        }
    }

    void brake() {
        if (engine.injectionFactor > 0.5) {
            engine.injectionFactor -= 0.4;
        }
    }

    void stop() {
        engine.running = false;
    }

    boolean isRunning() {
        return engine.running;
    }
}
