package oop.inheritance;

public class Hero extends Player {

    public Hero(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean attack(Player player) {
        boolean attack1 = super.attack(player);
        boolean attack2 = super.attack(player);
        return attack1 || attack2;
    }
}
