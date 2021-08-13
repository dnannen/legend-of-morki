package model.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Map implements IMap {

    private HashMap<SetOfCoordinates, Tile> map;
    private List<SetOfCoordinates> path;
    private List<SetOfCoordinates> scenery;
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
        this.path = createPath();
        this.scenery = createScenery();



        return map;
    }

    @Override
    public Tile getTile(int x, int y) {
        SetOfCoordinates coordinates = new SetOfCoordinates(x, y);
        return this.map.get(coordinates);
    }

    @Override
    public List<SetOfCoordinates> createPath() {
        final int MAX_STRAY = 3;
        int currentDepth = 1;
        int currentBreadth = 5;

        int rightStray = 0;
        int leftStray = 0;

        List<SetOfCoordinates> pathCoordinates = new ArrayList<>();
        SetOfCoordinates start = new SetOfCoordinates(currentDepth, currentBreadth);
        pathCoordinates.add(start);

        while (currentDepth < this.width) {
            double strayChance = Math.random() * 100;

            if (strayChance <= 25 && rightStray < MAX_STRAY) {
                rightStray++;
                currentBreadth++;

                pathCoordinates.add(new SetOfCoordinates(currentDepth, currentBreadth));
                pathCoordinates.add(new SetOfCoordinates(currentDepth + 1, currentBreadth));
                currentDepth++;
            } else if (strayChance >= 75 && leftStray < MAX_STRAY) {
                leftStray++;
                currentBreadth--;

                pathCoordinates.add(new SetOfCoordinates(currentDepth, currentBreadth));
                pathCoordinates.add(new SetOfCoordinates(currentDepth + 1, currentBreadth));
                currentDepth++;
            } else {
                currentDepth++;
                pathCoordinates.add(new SetOfCoordinates(currentDepth, currentBreadth));
            }
        }
        return pathCoordinates;
    }

    public List<SetOfCoordinates> getPath() {
        return this.path;
    }

    @Override
    public List<SetOfCoordinates> createScenery() {
        return null;
        //TODO
    }

    public List<SetOfCoordinates> getScenery() {
        return this.scenery;
    }
}
