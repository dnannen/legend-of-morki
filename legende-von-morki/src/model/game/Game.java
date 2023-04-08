package model.game;

import model.AMapObject;
import model.Tile;
import model.map.Map;

public class Game {

    private Map map;

    public Game(Map map) {
        this.map = map;
    }

    /**
     * Spawns a walking unit on the first Tile of the Path
     */
    public void spawnWalkingUnit(AMapObject mapObject) {
        //TODO this.map.getPath.add(...)
    }

    /**
     * Spawns a unit on the desired Tile
     */
    public void setUnit(AMapObject mapObject, Tile tile) {
        this.map.getTile(tile.getXCoordinate(), tile.getYCoordinate()).addObject(mapObject);
        //TODO add Object types and their specific properties
    }
}
