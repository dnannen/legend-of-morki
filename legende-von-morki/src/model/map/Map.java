package model.map;

import java.util.ArrayList;
import java.util.HashMap;

public class Map implements IMap {

    private HashMap<SetOfCoordinates, Tile> map;
    private HashMap<SetOfCoordinates, Tile> path = new HashMap<>();
    private HashMap<SetOfCoordinates, Tile> scenery = new HashMap<>();
    private int length;
    private int width;

    public Map(int xLength, int yWidth) {
        this.length = xLength;
        this.width = yWidth;
        this.map = create();
    }

    @Override
    public HashMap<SetOfCoordinates, Tile> create() {

        int x = 0;
        int y = 0;
        HashMap<SetOfCoordinates, Tile> map = new HashMap<>();

        while (map.size() <= length * width) {
            SetOfCoordinates key = new SetOfCoordinates(x, y);
            Tile value = new Tile(x, y);

            map.put(key, value);

            if (x == length) {
                if (y == width) {
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
        final int MAX_STRAY = 2;
        int currentStray = 0;
        int currentDepth = 1;
        int currentBreadth = 5;

        SetOfCoordinates start = new SetOfCoordinates(currentDepth, currentBreadth);
        Tile startTile = this.getTile(currentDepth, currentBreadth);

        this.path.put(start, startTile);

        while (currentDepth < this.width) {
            currentDepth++;
            double strayChance = Math.random() * 100;

            //TODO this only places one path per x-value, so can lead to tiles missing
            if (strayChance <= 12.5 && currentStray < MAX_STRAY) {
                currentStray++;
                currentBreadth++;
            } else if (strayChance >= 87.5 && currentStray < -MAX_STRAY) {
                currentStray--;
                currentBreadth--;
            }

            this.path.put(new SetOfCoordinates(currentDepth, currentBreadth),
                          this.getTile(currentDepth, currentBreadth)
            );
        }

    }

    public HashMap<SetOfCoordinates, Tile> getPath() {
        return this.path;
    }

    @Override
    public void createScenery() {
        //TODO
    }

    public HashMap<SetOfCoordinates, Tile> getScenery() {
        return this.scenery;
    }
}
