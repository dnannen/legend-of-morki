package model;

public abstract class AGameEntity implements IActiveGameEntityAbilities, IGameEntityAttributes {

    private int hp;
    private int dmg;
    private float speed;
    private double attackspeed;
    private int armour;
    private int ap;
    private boolean aoe;

    @Override
    public abstract void die();

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getDmg() {
        return this.dmg;
    }

    @Override
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public double getAttackspeed() {
        return this.attackspeed;
    }

    @Override
    public void setAttackspeed(double attackspeed) {
        this.attackspeed = attackspeed;
    }

    @Override
    public int getArmour() {
        return this.armour;
    }

    @Override
    public void setArmour(int armor) {
        this.armour = armor;
    }

    @Override
    public int getAP() {
        return this.ap;
    }

    @Override
    public void setAP(int AP) {
        this.ap = AP;
    }

    @Override
    public boolean isAoe() {
        return aoe;
    }

    @Override
    public void setAoe(boolean aoe) {
        this.aoe = aoe;
    }
}
