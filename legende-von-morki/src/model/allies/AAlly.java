package model.allies;

import model.AGameEntity;
import model.enemies.AEmeny;
import model.map.Tile;

import java.util.List;

public abstract class AAlly extends AGameEntity {

    public AAlly(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe, Tile tile) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackspeed(attackspeed);
        this.setArmour(armour);
        this.setAP(ap);
        this.setAoe(aoe);

        this.addTo(tile);
        tile.enterUnit(this);
    }

    @Override
    public void die() {
        this.getTile().removeUnit(this);
    }

    @Override
    public void move(List<Tile> path) {
        //this.wait();
        //TODO
    }

    @Override
    public void attack(AEmeny target) {
        target.setHp(target.getHp() - (this.getDmg() - target.getArmour()));
    }

}
