package model.enemies;

import model.IActiveGameEntityAbilities;
import model.IGameEntityAttributes;
import model.enemies.grunts.EvilMage;

public class Enemy implements IActiveGameEntityAbilities, IGameEntityAttributes {

    //TODO early stage, some functionality still missing

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

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getDmg() {
        return 0;
    }

    @Override
    public void setDmg(int dmg) {

    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public void setSpeed(float speed) {

    }

    @Override
    public double getAttackspeed() {
        return 0;
    }

    @Override
    public void setAttackspeed(double attackspeed) {

    }

    @Override
    public int getArmour() {
        return 0;
    }

    @Override
    public void setArmour(int armor) {

    }

    @Override
    public int getAP() {
        return 0;
    }

    @Override
    public void setAP(int AP) {

    }

    @Override
    public boolean isAoe() {
        return false;
    }

    @Override
    public void setAoe(boolean aoe) {

    }
}
