package model;

import model.map.Tile;

public abstract class AGameEntity implements IActiveGameUnitAbilities, IGameUnitAttributes {

    private int hp;
    private int dmg;
    private int range;
    private double speed;
    private double attackSpeed;
    private int armour;
    private int ap;
    private boolean aoe;
    private Tile tile;

    @Override
    public void die() {
        this.setTile(null);
        this.getTile().removeUnit(this);
    }

    @Override
    public void move(Tile destination) {
        this.getTile().removeUnit(this);
        destination.enterUnit(this);
        this.setTile(destination);
    }

    @Override
    public void attack(AGameEntity target) {
        target.setHp(target.getHp() - (this.getDmg() - target.getArmour()));
    }

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
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public double getAttackSpeed() {
        return this.attackSpeed;
    }

    @Override
    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
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

    @Override
    public Tile getTile() {
        return this.tile;
    }

    @Override
    public void setTile(Tile tile) {
        this.tile = tile;
    }
}
