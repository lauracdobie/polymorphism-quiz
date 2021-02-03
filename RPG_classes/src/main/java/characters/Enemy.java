package characters;

import behaviours.IFight;
import behaviours.ITalk;
import game.Player;
import objects.Weapon;


public class Enemy extends Character implements IFight, ITalk {
    public Weapon weakness;

    public Enemy(String name, Weapon weakness) {
        super(name);
        this.weakness = weakness;
    }

    public Weapon getWeakness() {
        return weakness;
    }

    public String fight(Player player) {
        if (player.getWeapon() == this.weakness){
            return "Player wins";
        }
        return "Player is defeated!";
    }

    @Override
    public String talk() {
        return "I'm going to kill you!";
    }
}
