package model.allies.soldiers;

import model.allies.Ally;

public class Paladin extends Ally {
    private int maxHp = 30;
    //70, 25, 3, 0.3, 30, 5, false
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
            this.setHp(maxHp / 2);
            this.setDmg(this.getDmg() * 2);
        } else {
            this.setHp(0);
        }
    }
}
