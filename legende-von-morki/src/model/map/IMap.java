package model.map;

import java.util.HashMap;

public interface IMap {

    public void create(int xLength, int yLength);

    public HashMap<SetOfCoordinates, Tile> createPath();
}
