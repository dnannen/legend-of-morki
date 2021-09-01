package model.allies;

import model.AGameEntity;

public abstract class AAlly extends AGameEntity {

    public AAlly(int hp, int dmg, double speed, double attackspeed, int armour, boolean aoe) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackSpeed(attackspeed);
        this.setArmour(armour);
        this.setAoe(aoe);
    }

}
