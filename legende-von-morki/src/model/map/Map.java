package model.map;

import java.util.ArrayList;
import java.util.List;

public class Map implements IMap {

    private List<Tile> tiles = new ArrayList<>();

    private final int LENGTH;
    private final int WIDTH;

    private List<SetOfCoordinates> path;
    private List<SetOfCoordinates> scenery;

    public Map(int xLength, int yWidth) {
        this.LENGTH = xLength;
        this.WIDTH = yWidth;
        this.create();
    }

    @Override
        public void create() {
        int x = 1;
        int y = 1;
        int tileID = 1;

        while (true) {
            this.tiles.add(new Tile(tileID, x, y));
            tileID++;

            y++;
            if (y > WIDTH) {
                y = 1;
                x++;
                if (x > LENGTH) break;
            }

            this.path = createPath();
        /*for (SetOfCoordinates setOfCoordinates : path) {
            this.getTile(setOfCoordinates.getX(), setOfCoordinates.getY()).setPathTile(true);
        }*/

            this.scenery = markScenery();
        /*for (SetOfCoordinates setOfCoordinates : scenery) {
            this.getTile(setOfCoordinates.getX(), setOfCoordinates.getY()).setSceneryTile(true);
        }*/

        }
    }

    @Override
    public int size() {
        return this.tiles.size();
    }

    @Override
    public Tile getTile(int x, int y) {
        return this.tiles.get((x * 10) + y);
    }

    @Override
    public Tile getTileFromID(int id) {
        return this.tiles.get(id);
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

    //TODO test if this works
    @Override
    public List<SetOfCoordinates> markScenery() {
        int currentDepth = 1;
        int currentBreadth = 5;

        List<SetOfCoordinates> sceneryCoordinates = new ArrayList<>();

        currentBreadth -= 2;
        while (currentBreadth > 1) {
            sceneryCoordinates.add(new SetOfCoordinates(currentDepth, currentBreadth));
            currentBreadth--;
        }

        currentBreadth += 2;
        while (currentBreadth < 10) {
            sceneryCoordinates.add(new SetOfCoordinates(currentDepth, currentBreadth));
            currentBreadth++;
        }

        return sceneryCoordinates;
    }

    public List<SetOfCoordinates> getScenery() {
        return this.scenery;
    }

}
