package model.enemies;

import model.AGameEntity;
import model.enemies.grunts.EvilMage;

public class Enemy extends AGameEntity {

    public Enemy(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackspeed(attackspeed);
        this.setArmour(armour);
        this.setAP(ap);
        if (this instanceof EvilMage) {
            this.setAoe(true);
        } else {
            this.setAoe(aoe);
        }
    }

    @Override
    public void die() {

    }
}
