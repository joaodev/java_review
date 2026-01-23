package oop.inheritance;

public class Monster extends Player {

    public Monster() {
        this(0, 0);
    }

    Monster(int x, int y) {
        super(x, y);
    }
}
