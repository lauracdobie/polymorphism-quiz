package game;

import characters.Enemy;
import characters.Friend;
import objects.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Player player;
    Enemy enemy;
    Weapon broadSword;
    Weapon dagger;
    Friend friend;
    Game game;

    @Before
    public void before() {
        player = new Player("Falconhoof", broadSword, 6);
        broadSword = new Weapon("broad sword");
        dagger = new Weapon("spoon");
        enemy = new Enemy("Charn", broadSword);
        friend = new Friend("Eva");
        game = new Game(player);
        game.addEnemy(enemy);
        game.addFriend(friend);
    }

    @Test
    public void canGetAllCharacters() {
        assertEquals(2, game.getAllCharacters().size());
    }

    @Test
    public void canPlay(){
        assertEquals("Let's go on a slightly hazardous adventure!", game.play());
    }

}