package game;
import objects.Weapon;

public class Player {
    private String name;
    private Weapon weapon;
    private int health;


    public Player(String name, Weapon weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
