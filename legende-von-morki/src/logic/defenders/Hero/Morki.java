package logic.defenders.Hero;

import logic.field.GameField;
import logic.skills.TacticianSkill;

/**
 * Created by schlumpy on 02.07.2018.
 */
public class Morki extends AHero {

    public Morki(GameField gameField){
        this.setHp(50);
        this.setDmg(20);
        this.setAttackspeed(0.35);
        this.setAlive(true);
        this.setAoe(false);

        this.setAP(10);
        this.setArmor(5);

        //skills
        this.setMainSkill(new TacticianSkill());//use nutzt den skill
        this.setSecondSkill(null);
        this.setThirdSkill(null);
    }


    @Override
    public void setField(GameField gamefield) {

    }

    @Override
    public GameField getField() {
        return null;
    }
}
