package naomi.hot.rpg.entities;

public class Entity {

    protected String name;
    protected int level;

    protected int health;
    protected int maxHealth;

    protected int mana;
    protected int maxMana;

    protected int speed;
    protected int power;

    public Entity(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

}
