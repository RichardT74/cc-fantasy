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

    public void defend(int damage) {
        health -= damage;
    }

    public void heal(int replenishment) {
        health += replenishment;
    }

    public void collect(int value) {
        inventory += value;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getInventory() {
        return inventory;
    }
}
