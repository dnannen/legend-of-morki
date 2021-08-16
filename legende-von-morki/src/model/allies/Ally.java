package model.allies;

import model.AGameEntity;
import model.enemies.Enemy;
import model.map.Tile;

import java.util.List;

public class Ally extends AGameEntity {

    private Tile tile;

    public Ally(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackspeed(attackspeed);
        this.setArmour(armour);
        this.setAP(ap);
        this.setAoe(aoe);
    }

    @Override
    public void die() {
        this.tile = null;
        this.getTile().removeUnit(this);
    }

    @Override
    public void move(List<Tile> path) {
        //this.wait();
        //TODO
    }

    @Override
    public void attack(Enemy target) {
        target.setHp(target.getHp() - (this.getDmg() - target.getArmour()));
    }

    @Override
    public Tile getTile() {
        return this.tile;
    }

    @Override
    public void addTo(Tile tile) {
        this.tile = tile;
    }
}
