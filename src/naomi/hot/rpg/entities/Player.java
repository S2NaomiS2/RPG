package naomi.hot.rpg.entities;

public class Player extends Entity {

    private int xp, maxXp;

    public Player(String name, int level) {
        super(name, level);
        xp = 0;
        maxXp = 50;
    }



}
