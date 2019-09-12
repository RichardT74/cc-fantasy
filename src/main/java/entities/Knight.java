package entities;

import behaviour.IAttack;
import items.Armour;
import items.Weapon;

public class Knight extends Entity implements IAttack {
    private Armour armour;
    private Weapon weapon;

    public Knight(String name, int health, Armour armour, Weapon weapon) {
        super(name, health);
        this.armour = armour;
        this.weapon = weapon;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void defend(int damage) {
        int reduceDamage = damage - armour.getValue();
        health -= reduceDamage;
    }

    public void attack(Entity entity) {
        entity.defend(weapon.getValue());
    }
}

