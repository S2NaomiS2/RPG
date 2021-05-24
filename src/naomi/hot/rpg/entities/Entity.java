package naomi.hot.rpg.entities;

public abstract class Entity {

    protected String name;
    protected int level;

    protected int health;
    protected int maxHealth;

    protected int mana;
    protected int maxMana;

    protected int speed;
    protected int power;
    protected int def;

    public Entity(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void attack(Entity enemy) {

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

    public void setHealth(int health) {
        this.health = health;
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
