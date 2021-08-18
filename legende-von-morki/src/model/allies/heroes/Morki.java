package model.allies.heroes;

import model.map.Tile;
import model.skills.ISkill;

import java.util.ArrayList;

public class Morki extends AHero {

    public Morki( ArrayList<ISkill> skills, Tile tile) {
        super(200, 25, 2, 0.5, 5, 5, false, skills, tile);
    }
}
