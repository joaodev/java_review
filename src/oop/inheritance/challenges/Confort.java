package oop.inheritance.challenges;

public interface Confort {

    public void turnOnAirConditioning();
    abstract void turnOffAirConditioning();

    default int airLevel() {
        return 1;
    }
}
