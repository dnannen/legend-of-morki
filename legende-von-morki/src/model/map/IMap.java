package model.map;

import java.util.HashMap;

public interface IMap {

    HashMap<SetOfCoordinates, Tile> create();

    Tile getTile(int x, int y);

    //TODO these should maybe return the modified HashMap

    void createPath();

    void createScenery();
}
