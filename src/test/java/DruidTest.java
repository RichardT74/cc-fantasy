import entities.Druid;
import entities.Enemy;
import entities.Knight;
import items.Armour;
import items.HealingItem;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DruidTest {

    private Druid druid;
    private HealingItem herbs;
    private Knight knight;
    private Enemy troll;

    @Before
    public void before() {
        herbs = HealingItem.HERBS;
        druid = new Druid("Getafix", 40, herbs);
        knight = new Knight("Barry", 50, Armour.CHAIN, Weapon.CLUB);
        troll = new Enemy("Troll", 50, 10);
    }

    @Test
    public void testSetHealingItem() {
        HealingItem newItem = HealingItem.POTION;
        druid.setHealingItem(newItem);
        assertEquals(druid.getHealingItem(), newItem);
    }

    @Test
    public void testDefend() {
        troll.attack(druid);
        assertEquals(druid.getHealth(), 30);
    }

    @Test
    public void testHeal() {
        druid.heal(knight);
        assertEquals(knight.getHealth(), 55);
    }
}
