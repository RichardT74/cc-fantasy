package entities;

import behaviour.IAttack;
import items.Pet;
import items.Spell;

public class Wizard extends Entity implements IAttack {
    private Pet pet;
    private Spell spell;

    public Wizard(String name, int health, Pet pet, Spell spell) {
        super(name, health);
        this.pet = pet;
        this.spell = spell;
    }

    @Override
    public void defend(int damage) {
        int reduceDamage = damage - pet.getValue();
        health -= reduceDamage;
    }

    public void attack(Entity entity) {
        entity.defend(spell.getValue());
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
