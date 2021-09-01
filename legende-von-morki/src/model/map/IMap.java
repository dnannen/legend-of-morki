package model.map;

import java.util.List;

public interface IMap {

    void create();

    int size();

    Tile getTile(int x, int y);

    Tile getTileFromID(int id);

    List<Tile> createPath();

    List<Tile> markScenery();
}
