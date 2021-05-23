package naomi.hot.rpg.entities;

public class Enemy extends Entity {

    public Enemy(String name, int level, int health, int power, int speed) {
        super(name, level);

        super.health = health * level;
        super.maxHealth = super.health;

        super.power = power * level;
        super.speed = speed * level;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
}
