package model.allies.soldiers;

import model.allies.Ally;

public class Paladin extends Ally {

    //70, 25, 3, 0.3, 30, 5, false
    public Paladin(int hp, int dmg, float speed, double attackspeed, int armour, int ap, boolean aoe) {
        super(hp, dmg, speed, attackspeed, armour, ap, aoe);
    }

    /**
     * Passive Ability: Faith
     * Has a 30% chance to be revived on spot with 50% max. HP and 200% damage
     */
    @Override
    public void die() {
        int random = (int) (Math.random() * 10);
        if (random == 4 || random == 2 || random == 0) {
            //blaze it
            this.setHp(35);
            this.setDmg(this.getDmg() * 2);
        } else {
            this.setHp(0);
        }
    }
}
