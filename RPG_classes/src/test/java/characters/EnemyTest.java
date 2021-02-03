package characters;

import game.Player;
import objects.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyTest {

    Player player;
    Enemy enemy;
    Weapon broadSword;
    Weapon dagger;

    @Before
    public void before() {
        player = new Player("Falconhoof", broadSword, 6);
        broadSword = new Weapon("broad sword");
        dagger = new Weapon("spoon");
        enemy = new Enemy("Charn", broadSword);
    }

    @Test
    public void canGetName() {
        assertEquals("Charn", enemy.getName());
    }

    @Test
    public void canSetName() {
        enemy.setName("Evil Jester");
        assertEquals("Evil Jester", enemy.getName());
    }

    @Test
    public void canTalk() {
        assertEquals("I'm going to kill you!", enemy.talk());
    }

    @Test
    public void canFightPlayerAndLose() {
        player.setWeapon(broadSword);
        enemy.fight(player);
        assertEquals("Player wins", enemy.fight(player));
    }

    @Test
    public void canFightPlayerAndWin() {
        player.setWeapon(dagger);
        assertEquals("Player is defeated!", enemy.fight(player));
    }

}