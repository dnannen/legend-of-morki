package model.enemies;

import model.AGameEntity;

public abstract class AEnemy extends AGameEntity {

    public AEnemy(int hp, int dmg, double speed, double attackspeed, int armour, boolean aoe) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackSpeed(attackspeed);
        this.setArmour(armour);
        this.setAoe(aoe);
    }

}
