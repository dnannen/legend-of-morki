package model.map;

import java.util.HashMap;
import java.util.List;

public interface IMap {

    void create();

    Tile getTile(int x, int y);

    List<SetOfCoordinates> createPath();

    List<SetOfCoordinates> createScenery();
}
