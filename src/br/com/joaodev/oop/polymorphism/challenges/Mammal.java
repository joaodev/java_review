package br.com.joaodev.oop.polymorphism.challenges;

public abstract class Mammal extends Animal {

    @Override
    public final String move() {
        return "Using their paws...";
    }

    public abstract String eat();
}
