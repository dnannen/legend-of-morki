package model.enemies.grunts;

import model.enemies.Enemy;

public class EvilMage extends Enemy {

    public EvilMage(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe) {
        super(hp, dmg, speed, attackspeed, armour, ap, aoe);
    }

    //TODO special abilitie, damages all entities in the tiles around him for half of his dmg
    public void die() {

    }
}
