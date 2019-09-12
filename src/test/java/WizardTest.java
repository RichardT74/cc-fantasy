import entities.Enemy;
import entities.Wizard;
import items.Pet;
import items.Spell;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Enemy troll;
    Wizard wizard;
    Spell spell;
    Pet pet;

    @Before
    public void before() {
        troll = new Enemy("Troll", 30, 10);
        spell = Spell.LIGHTNING;
        pet = Pet.CAT;
        wizard = new Wizard("Harry", 25, pet, spell);
    }

    @Test
    public void testSetPet() {
        Pet newPet = Pet.DRAGON;
        wizard.setPet(newPet);
        assertEquals(wizard.getPet(), newPet);

    }

    @Test
    public void testSetSpell() {
        Spell newSpell = Spell.FIREBALL;
        wizard.setSpell(newSpell);
        Assert.assertEquals(wizard.getSpell(), newSpell);
    }

    @Test
    public void testAttack() {
        wizard.attack(troll);
        assertEquals(troll.getHealth(), 20);
    }

    @Test
    public void testDefend() {
        troll.attack(wizard);
        assertEquals(wizard.getHealth(), 20);
    }
}
