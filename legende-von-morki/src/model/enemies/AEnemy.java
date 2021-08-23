package model.enemies;

import model.AGameEntity;
import model.enemies.grunts.EvilMage;
import model.map.Tile;

public abstract class AEnemy extends AGameEntity {

    public AEnemy(int hp, int dmg, double speed, double attackspeed, int armour, int ap, boolean aoe, Tile tile) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackSpeed(attackspeed);
        this.setArmour(armour);
        this.setAP(ap);
        if (this instanceof EvilMage) {
            this.setAoe(true);
        } else {
            this.setAoe(aoe);
        }

        this.setTile(tile);
        tile.enterUnit(this);
    }

}
