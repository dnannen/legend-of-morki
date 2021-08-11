package model.allies;

import model.AGameEntity;

public class Ally extends AGameEntity {

    public Ally(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackspeed(attackspeed);
        this.setArmour(armour);
        this.setAP(ap);
        this.setAoe(aoe);
    }

}
