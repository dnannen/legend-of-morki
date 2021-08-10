package model.allies.soldiers;

import model.allies.Ally;

public class Catapult extends Ally {

    //144, 25, 0, 0.2, 5, 0, true
    public Catapult(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe) {
        super(hp, dmg, speed, attackspeed, armour, ap, aoe);
    }

    //TODO implement passive ability, if this unit has an engineer maintaining it, some values will be buffed (like attackspeed)
}
