package model.enemies.grunts;

import model.enemies.AEnemy;
import model.map.Tile;

public class EvilMage extends AEnemy {

    public EvilMage(Tile tile) {
        super(45, 15, 1, 0.75, 25, 50, true, tile);
    }

    //TODO special abilities, damages all entities in the tiles around him for half of his dmg
    public void die() {

    }
}
