package model.enemies.grunts;

import model.enemies.AEnemy;
import model.map.Tile;

import java.util.List;

public class EvilMage extends AEnemy {

    public EvilMage() {
        super(45, 15, 1, 0.75, 25, true);
        //TODO change later
        //this.setRange(this.getTile().getSurroundingTiles(this.getTile().getMap()));
    }

    @Override
    public void die() {
        List<Tile> targeted = this.getTile().getSurroundingTiles(this.getTile().getMap());
        for (Tile tile : targeted) {
            for (int i = 0; i < tile.getCurrentUnitsOnTile().size(); i++) {
                tile.getCurrentUnitsOnTile().get(i).setHp(tile.getCurrentUnitsOnTile().get(i).getHp() - this.getDmg() / 2);
            }
        }
    }
}
