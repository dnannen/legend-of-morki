package model.skills;

import model.allies.heroes.AHero;

public class TacticSkill extends ASkill {

    public TacticSkill(AHero hero) {
        super("Master Tactician", hero, 0.12, 0, 0.4, 0);
    }

    @Override
    public void use() {
        //TODO
    }
}
