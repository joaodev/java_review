package br.com.joaodev.oop.polymorphism;

public class Dinner {

    public static void main(String[] args) {

        Person guest = new Person(70);
        System.out.println("Current weight: " + guest.getWeight());

        Rice rice = new Rice(0.3);
        Bean bean = new Bean(0.2);
        Food morBean = new Bean(0.3);

        guest.eat(rice);
        System.out.println(guest.getWeight());

        guest.eat(bean);
        guest.eat(morBean);
        System.out.println(guest.getWeight());

        IceCream iceCream = new IceCream(0.1);
        guest.eat(iceCream);
        System.out.println("Final weight after dinner: " + guest.getWeight());
    }
}
