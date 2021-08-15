package model.map;

import java.util.HashMap;
import java.util.List;

public interface IMap {

    void create();

    Tile getTile(int x, int y);

    HashMap<SetOfCoordinates, Tile> getField();

    //Tile getTileFromID(int id);

    List<SetOfCoordinates> createPath();

    List<SetOfCoordinates> markScenery();
}
