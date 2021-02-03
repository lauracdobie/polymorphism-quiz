package game;

import objects.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    Player player;
    Weapon weapon;
    Weapon otherWeapon;

    @Before
    public void before() {
        weapon = new Weapon("broad sword");
        otherWeapon = new Weapon("dagger");
        player = new Player("Falconhoof", weapon, 6);
    }

    @Test
    public void canGetName() {
        assertEquals("Falconhoof", player.getName());
    }

    @Test
    public void canSetName() {
        player.setName("Dave");
        assertEquals("Dave", player.getName());
    }

    @Test
    public void canGetWeapon() {
        assertEquals("broad sword", player.getWeapon().getName());
    }

    @Test
    public void canSetWeapon() {
        player.setWeapon(otherWeapon);
        assertEquals("dagger", player.getWeapon().getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(6, player.getHealth());
    }

    @Test
    public void canSetHealth() {
        player.setHealth(4);
        assertEquals(4, player.getHealth());
    }
}