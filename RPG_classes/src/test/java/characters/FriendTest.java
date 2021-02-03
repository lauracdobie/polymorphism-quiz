package characters;

import game.Player;
import objects.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendTest {
    Player player;
    Friend friend;
    Weapon weapon;

    @Before
    public void before() {
        player = new Player("Falconhoof", weapon, 6);
        weapon = new Weapon("broad sword");
        friend = new Friend("Eva");
    }

    @Test
    public void canGetName() {
        assertEquals("Eva", friend.getName());
    }

    @Test
    public void canSetName() {
        friend.setName("Jester");
        assertEquals("Jester", friend.getName());
    }

    @Test
    public void canTalk() {
        assertEquals("I can help you!", friend.talk());
    }

    @Test
    public void canHealPlayer() {
        friend.heal(player);
        assertEquals(7, player.getHealth());
    }

}