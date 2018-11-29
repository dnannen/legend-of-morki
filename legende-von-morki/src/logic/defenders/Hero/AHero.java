package logic.defenders.Hero;

import logic.AGameEntity;
import logic.IGameEntity;
import logic.skills.ISkill;
import logic.field.Tile;

/**
 * Created by schlumpy on 05.07.2018.
 */
public abstract class AHero extends AGameEntity {

    private ISkill mainSkill;
    private ISkill secondSkill;
    private ISkill thirdSkill;


    /**
     * Returns this hero's first skill or main skill
     * @return mainSkill/firstSkill
     */
    public ISkill getMainSkill() {
        return this.mainSkill;
    }

    /**
     * Sets what this hero's main skill is capable of
     * @param mainSkill Interface for the skill that is used
     */
    public void setMainSkill(ISkill mainSkill) {

    }

    /**
     * Returns this hero's second skill
     * @return secondSkill
     */
    public ISkill getSecondSkill() {
        return this.secondSkill;
    }

    /**
     * Sets what this hero's second skill is capable of
     * @param secondSkill Interface for the skill that is used
     */
    public void setSecondSkill(ISkill secondSkill) {

    }

    /**
     * Return this hero's third skill
     * @return thirdSkill
     */
    public ISkill getThirdSkill() {
        return this.thirdSkill;
    }

    /**
     * Sets what this hero's third skill is capable of
     * @param thirdSkill Interface for the skill that is used
     */
    public void setThirdSkill(ISkill thirdSkill) {

    }

    /**
     * Returns the level of this hero
     * @return current level
     */
    public int getLevel() {
        return 0;
    }

    /**
     * sets the new level of this hero
     * @param level new level
     */
    public void setLevel(int level) {

    }
}
