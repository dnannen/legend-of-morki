package model.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map implements IMap {

    private HashMap<SetOfCoordinates, Tile> map = new HashMap<>();
    private List<SetOfCoordinates> path;
    private List<SetOfCoordinates> scenery;
    private final int LENGTH;
    private final int WIDTH;

    public Map(int xLength, int yWidth) {
        this.LENGTH = xLength;
        this.WIDTH = yWidth;
        this.create();
    }

    //TODO the Map's tiles don't get initialized very well
    @Override
        public void create() {
        int x = 1;
        int y = 1;

        while (map.size() <= LENGTH * WIDTH) {
            SetOfCoordinates key = new SetOfCoordinates(x, y);
            Tile value = new Tile(x, y);

            map.put(key, value);

            if (x == LENGTH) {
                if (y == WIDTH) {
                    break;
                } else { y++; }
            } else { x++; }
        }

        this.path = createPath();
        /*for (SetOfCoordinates setOfCoordinates : path) {
            this.getTile(setOfCoordinates.getX(), setOfCoordinates.getY()).setPathTile(true);
        }*/

        this.scenery = createScenery();
        /*for (SetOfCoordinates setOfCoordinates : scenery) {
            this.getTile(setOfCoordinates.getX(), setOfCoordinates.getY()).setSceneryTile(true);
        }*/

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

        while (currentDepth < this.WIDTH) {
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

    //TODO
    @Override
    public List<SetOfCoordinates> createScenery() {
        int currentDepth = 1;
        int currentBreadth = 5;

        //List<SetOfCoordinates> sceneryCoordinates = new ArrayList<>();

        //return sceneryCoordinates;
        return null;
    }

    public List<SetOfCoordinates> getScenery() {
        return this.scenery;
    }
}
