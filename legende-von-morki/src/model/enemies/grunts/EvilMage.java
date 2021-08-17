package model.enemies.grunts;

import model.enemies.Enemy;

public class EvilMage extends Enemy {

    public EvilMage() {
        super(45, 15, 1, 0.75, 25, 50, true);
    }

    //TODO special abilitie, damages all entities in the tiles around him for half of his dmg
    public void die() {

    }
}
