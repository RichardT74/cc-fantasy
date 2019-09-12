package entities;
import behaviour.IAttack;

public class Enemy extends Entity implements IAttack {

    private int attackDamage;

    public Enemy(String name, int health, int attackDamage) {
        super(name, health);
        this.attackDamage = attackDamage;
    }

    public void attack(Entity entity) {
        entity.defend(attackDamage);
    }
}
