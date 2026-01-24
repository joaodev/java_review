package br.com.joaodev.classes.challenges.eat;

public class Dinner {

    public static void main(String[] args) {

        Food f1 = new Food("Rice", 0.223);
        Food f2 = new Food("Chicken", 0.323);

        Person p = new Person("John", 99.8);

        System.out.println(p.presentSelf());
        p.eat(f1);

        System.out.println(p.presentSelf());
        p.eat(f2);

        System.out.println(p.presentSelf());
    }
}
