package entities;

public abstract class Entity {
    protected String name;
    protected int health;
    protected int inventory;

    public Entity(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = 0;
    }

    protected void defend(int damage) {
        health -= damage;
    }

    protected void heal(int replenishment) {
        health += replenishment;
    }

    protected void collect(int value) {
        inventory += value;
    }
}
