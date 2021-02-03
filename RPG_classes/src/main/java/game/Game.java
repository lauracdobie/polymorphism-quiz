package game;

import behaviours.ITalk;
import characters.Enemy;
import characters.Friend;

import java.util.ArrayList;

public class Game {
    ArrayList<Friend> friends;
    ArrayList<Enemy> enemies;
    Player player;

    public Game(Player player) {
        this.player = player;
        this.friends = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public ArrayList getFriends() {
        return this.friends;
    }

    public ArrayList getEnemies() {
        return this.enemies;
    }

    public void addFriend(Friend friend) {
        this.friends.add(friend);
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public ArrayList getAllCharacters() {
        ArrayList<ITalk> allCharacters = new ArrayList<>();
        allCharacters.addAll(this.friends);
        allCharacters.addAll(this.enemies);

        return allCharacters;
    }

    public String play() {
        return "Let's go on a slightly hazardous adventure!";
    }

}
