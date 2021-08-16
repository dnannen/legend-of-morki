package model.allies.soldiers;

import model.allies.Ally;

public class Paladin extends Ally {

    private final int MAX_HP = 30;

    public Paladin() {
        super(70, 25, 3, 0.3, 30, 5, false);
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
            this.setHp(MAX_HP / 2);
            this.setDmg(this.getDmg() * 2);
        } else {
            this.setHp(0);
            //TODO delete instead of set 0?
        }
    }
}
