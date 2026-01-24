package br.com.joaodev.oop.inheritance.tests;

import br.com.joaodev.oop.inheritance.Direction;
import br.com.joaodev.oop.inheritance.Hero;
import br.com.joaodev.oop.inheritance.Monster;

public class GameTest {

    public static void main(String[] args) {

        Monster monster = new Monster();
        monster.x = 10;
        monster.y = 10;

        Hero hero = new Hero(10, 11);

        System.out.println("Monster life: " + monster.life);
        System.out.println("Hero life " + hero.life);

        monster.attack(hero);
        hero.attack(monster);

        System.out.println("Monster life: " + monster.life);
        System.out.println("Hero life " + hero.life);

        monster.walk(Direction.N0RTH);
        hero.walk(Direction.EAST);

        System.out.println(monster.y);
        System.out.println(hero.x);
    }
}
