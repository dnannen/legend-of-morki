package model.map;

import java.util.HashMap;

public interface IMap {

    HashMap<SetOfCoordinates, Tile> create(int xLength, int yLength);

    //TODO these should maybe return the modified HashMap

    Tile getTile(int x, int y);

    void createPath();

    void createScenery();
}
