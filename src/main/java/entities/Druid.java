package entities;
import behaviour.IHeal;
import items.HealingItem;

public class Druid extends Entity implements IHeal {
    private HealingItem healingItem;

    public Druid(String name, int health, HealingItem healingItem) {
        super(name, health);
        this.healingItem = healingItem;
    }

    public HealingItem getHealingItem() {
        return healingItem;
    }

    public void setHealingItem(HealingItem healingItem) {
        this.healingItem = healingItem;
    }

    public void heal(Entity entity) {
        entity.heal(healingItem.getValue());
    }
}
