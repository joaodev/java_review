package br.com.joaodev.oop.inheritance;

public class Player {

    public int life = 100;
    public int x;
    public int y;

    protected Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean attack(Player player) {
        int deltalX = Math.abs(x - player.x);
        int deltaY = Math.abs(y - player.y);

        if (deltalX == 0 && deltaY == 1) {
            player.life -= 10;
            return true;
        } else if (deltalX == 1 && deltaY == 0) {
            player.life -= 10;
            return true;
        } else {
            return false;
        }
    }

    public void walk(Direction direction) {

        switch (direction) {
            case N0RTH:
                y--;
                break;
            case SOUTH:
                y++;
                break;
            case EAST:
                x++;
                break;
            case WEST:
                x--;
                break;
        }
    }
}
