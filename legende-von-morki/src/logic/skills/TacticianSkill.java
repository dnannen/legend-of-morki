package logic.skills;

import logic.IGameEntity;
import logic.field.GameField;

/**
 * Created by schlumpy on 05.07.2018.
 */
public class TacticianSkill implements ISkill {
    private GameField gameField;
    private IGameEntity hero;
    private double apUsage;
    private double damageUsage;
    private double armorUsage;

    public TacticianSkill() {
        this.apUsage = 0.12;
        this.damageUsage = 0;
        this.armorUsage = 0.4;
    }

    public void use(GameField gameField, IGameEntity hero) {
    }

}
