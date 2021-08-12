package model.map;

import java.util.HashMap;

public class Map implements IMap {

    //TODO maybe its better to just give the methods the sets instead of making them individually in all of them.

    HashMap<SetOfCoordinates, Tile> map;

    public Map(int xLength, int yLength) {
        this.map = create(xLength, yLength);
    }

    @Override
    //TODO, this can work maybe
    public HashMap<SetOfCoordinates, Tile> create(int xLength, int yLength) {

        int x = 0;
        int y = 0;
        HashMap<SetOfCoordinates, Tile> map = new HashMap<>();

        while (map.size() <= xLength * yLength) {
            SetOfCoordinates key = new SetOfCoordinates(x, y);
            Tile value = new Tile(x, y);

            map.put(key, value);

            if (x == xLength) {
                if (y == yLength) {
                    break;
                } else { y++; }
            } else { x++; }
        }

        return map;
    }

    @Override
    public Tile getTile(int x, int y) {
        SetOfCoordinates coordinates = new SetOfCoordinates(x, y);
        return this.map.get(coordinates);
    }

    @Override
    public void createPath() {
        //TODO
    }

    @Override
    public void createScenery() {
        //TODO
    }
}
