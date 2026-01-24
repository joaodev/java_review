package br.com.joaodev.oop.inheritance.challenges;

public class Car {

    public final int MAXIMUM_SPEED;
    protected int currentSpeed;
    private int delta = 5;

    protected Car(int maximumSpeed) {
        this.MAXIMUM_SPEED = maximumSpeed;
    }

    public void accelerate() {
        if (currentSpeed + getDelta() > MAXIMUM_SPEED) {
            currentSpeed = MAXIMUM_SPEED;
        } else {
            currentSpeed += getDelta();
        }
    }

    public void brake() {
        if (currentSpeed >= 5) {
            currentSpeed -= 5;
        } else {
            currentSpeed = 0;
        }
    }

    public String toString() {
        return "Current speed is: " + this.currentSpeed + " mph.";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
