package model.allies.soldiers;

import model.allies.Ally;

public class Archer extends Ally {

    //30, 14, 0, 0.5, 2, 0, false
    public Archer(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe) {
        super(hp, dmg, speed, attackspeed, armour, ap, aoe);
    }
}
