package characters;

import behaviours.IHeal;
import behaviours.ITalk;
import game.Player;

public class Friend extends Character implements IHeal, ITalk {

    public Friend(String name) {
        super(name);
    }

    public void heal(Player player) {
        int playerCurrentHealth = player.getHealth();
        player.setHealth(playerCurrentHealth + 1);
    }

    @Override
    public String talk() {
        return "I can help you!";
    }
}
