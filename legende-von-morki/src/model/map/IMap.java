package model.map;

import java.util.HashMap;
import java.util.List;

public interface IMap {

    HashMap<SetOfCoordinates, Tile> create();

    Tile getTile(int x, int y);

    //TODO these should maybe return the modified HashMap

    List<SetOfCoordinates> createPath();

    List<SetOfCoordinates> createScenery();
}
