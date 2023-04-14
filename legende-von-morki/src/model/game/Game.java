package model.game;

import model.objects.AMapObject;
import model.map.Tile;
import model.map.Map;

public class Game {

    private Map map;

    public Game(int width, int height) {
        map = new Map(width, height);
    }

    /**
     * Spawns a walking unit on the first Tile of the Path
     */
    public void spawnWalkingUnit(AMapObject mapObject) {
        this.map.getPath().get(0).addObject(mapObject);
    }

    /**
     * Spawns a unit on the desired Tile
     */
    public void setUnit(AMapObject mapObject, Tile tile) {
        this.map.getTile(tile.getXCoordinate(), tile.getYCoordinate()).addObject(mapObject);
        //TODO add Object types and their specific properties
    }
}
