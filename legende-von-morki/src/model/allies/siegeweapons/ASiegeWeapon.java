package model.allies.siegeweapons;

import model.AGameEntity;
import model.map.Tile;

public abstract class ASiegeWeapon extends AGameEntity {

    public ASiegeWeapon(int hp, int dmg, double speed, double attackspeed, int armour, int ap, boolean aoe) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackSpeed(attackspeed);
        this.setArmour(armour);
        this.setAP(ap);
        this.setAoe(aoe);
    }

}
