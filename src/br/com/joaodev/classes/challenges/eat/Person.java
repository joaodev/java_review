package br.com.joaodev.classes.challenges.eat;

public class Person {

    String name;
    double weight;

    Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat(Food food) {
        if (food != null) {
            this.weight += food.weight;
        }
    }

    String presentSelf() {
        return String.format("Hi, I'm %s and I weigh %.2f kilograms.", this.name, this.weight);
    }
}
