package model.enemies.grunts;

import model.enemies.Enemy;

public class Tank extends Enemy {

    //100, 5, 1 , 0.5, 25, 5, false
    public Tank(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe) {
        super(hp, dmg, speed, attackspeed, armour, ap, aoe);
    }
}
