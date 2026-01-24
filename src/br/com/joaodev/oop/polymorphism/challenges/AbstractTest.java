package br.com.joaodev.oop.polymorphism.challenges;

public class AbstractTest {

    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.breath());
        System.out.println(dog.move());
        System.out.println(dog.eat());
    }
}
