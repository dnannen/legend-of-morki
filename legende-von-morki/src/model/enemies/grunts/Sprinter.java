package model.enemies.grunts;

import model.enemies.Enemy;

public class Sprinter extends Enemy {

    //10, 30, 10, 0.7, 0, 0, false
    public Sprinter(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe) {
        super(hp, dmg, speed, attackspeed, armour, ap, aoe);
    }
}
