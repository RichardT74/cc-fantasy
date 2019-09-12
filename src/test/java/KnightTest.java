import entities.Enemy;
import entities.Knight;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Enemy troll;
    Knight knight;
    Weapon sword;
    Armour chain;

    @Before
    public void before() {
        troll = new Enemy("Troll", 20, 10);
        sword = Weapon.SWORD;
        chain = Armour.CHAIN;
        knight = new Knight("Barry", 50, chain, sword);
    }

    @Test
    public void testSetArmour() {
        Armour newArmour = Armour.PLATE;
        knight.setArmour(newArmour);
        assertEquals(knight.getArmour(), newArmour);
    }

    @Test
    public void testSetWeapon() {
        Weapon newWeapon = Weapon.CLUB;
        knight.setWeapon(newWeapon);
        assertEquals(knight.getWeapon(), newWeapon);
    }

    @Test
    public void testAttack() {
        knight.attack(troll);
        assertEquals(troll.getHealth(), 5);
    }

    @Test
    public void testDefend() {
        troll.attack(knight);
        assertEquals(knight.getHealth(), 45);
    }

}
