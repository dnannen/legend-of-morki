package logic;

import logic.defenders.ITurret;

public class DefendHandler {

    /**
     * Handles the fight between a defending turret and an attacking monster
     * @param defender ATurret
     * @param attacker IGameEntity (Monster)
     */
    public void handleDefence(ITurret defender, IGameEntity attacker) {
        AGameEntity[] defence = defender.getCurrentDefenders();
        //while there is at least one defender on the turret, it will result in a fight
        while (!defender.empty()) {
            //soldiers do damage to the attacker
            attacker.setHp(attacker.getHp() - defender.getTotalDefenderDamage());
            //does the attacker deal area of effect damage?
            if (attacker.isAoe()) {
                //deal damage to all soldiers
                for (AGameEntity curDefence : defence) {
                    if (curDefence != null) {
                        curDefence.setHp(curDefence.getHp() - attacker.getDmg());
                    }
                }
            } else {
                //if not, deal damage to the only nearest defender
                for (int i = defence.length; i > 0; i--) {
                    if (defence[i] != null) {
                        defence[i].setHp(defence[i].getHp() - attacker.getDmg());
                        break;
                    }
                }
            }
        }
    }
}
