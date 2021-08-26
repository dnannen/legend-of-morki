package model.allies.siegeweapons;

import model.AGameEntity;

public abstract class ASiegeWeapon extends AGameEntity {

    public ASiegeWeapon(int hp, int dmg, double speed, double attackspeed, int armour, boolean aoe) {
        this.setHp(hp);
        this.setDmg(dmg);
        this.setSpeed(speed);
        this.setAttackSpeed(attackspeed);
        this.setArmour(armour);
        this.setAoe(aoe);
    }

}
