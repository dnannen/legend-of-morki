package model.map;

import java.util.ArrayList;
import java.util.List;

public class Map implements IMap {

    private List<Tile> tiles = new ArrayList<>();

    private final int LENGTH;
    private final int WIDTH;

    private List<Tile> path;
    private List<Tile> scenery;

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
        }
        this.path = createPath();
        for (Tile tile : path) {
            tile.setPathTile(true);
        }

        this.scenery = markScenery();
        for (Tile tile : scenery) {
            tile.setSceneryTile(true);
        }

    }

    @Override
    public int size() {
        return this.tiles.size();
    }

    @Override
    public Tile getTile(int x, int y) {
        return this.tiles.get((x * 10 + y) - 10);
    }

    @Override
    public Tile getTileFromID(int id) {
        return this.tiles.get(id);
    }

    @Override
    public List<Tile> createPath() {
        final int MAX_STRAY = 3;
        int currentDepth = 1;
        int currentBreadth = 5;

        int rightStray = 0;
        int leftStray = 0;

        List<Tile> pathTiles = new ArrayList<>();
        pathTiles.add(new Tile(currentDepth * 10 + currentBreadth - 10, currentDepth, currentBreadth));

        while (currentDepth < this.WIDTH) {
            double strayChance = Math.random() * 100;

            if (strayChance <= 25 && rightStray < MAX_STRAY) {
                rightStray++;
                currentBreadth++;

                pathTiles.add(new Tile(currentDepth * 10 + currentBreadth - 10, currentDepth, currentBreadth));
                pathTiles.add(new Tile((currentDepth + 1) * 10 + currentBreadth - 10, currentDepth + 1, currentBreadth));
                currentDepth++;
            } else if (strayChance >= 75 && leftStray < MAX_STRAY) {
                leftStray++;
                currentBreadth--;

                pathTiles.add(new Tile(currentDepth * 10 + currentBreadth - 10, currentDepth, currentBreadth));
                pathTiles.add(new Tile((currentDepth + 1) * 10 + currentBreadth - 10, currentDepth + 1, currentBreadth));
                currentDepth++;
            } else {
                currentDepth++;
                pathTiles.add(new Tile(currentDepth * 10 + currentBreadth - 10, currentDepth, currentBreadth));
            }
        }
        return pathTiles;

    }

    public List<Tile> getPath() {
        return this.path;
    }

    //TODO test if this works
    @Override
    public List<Tile> markScenery() {
        int currentDepth = 1;
        int currentBreadth = 5;

        List<Tile> sceneryCoordinates = new ArrayList<>();

        currentBreadth -= 2;
        /*while (currentBreadth > 1) {
            sceneryCoordinates.add(new SetOfCoordinates(currentDepth, currentBreadth));
            currentBreadth--;
        }

        currentBreadth += 2;
        while (currentBreadth < 10) {
            sceneryCoordinates.add(new SetOfCoordinates(currentDepth, currentBreadth));
            currentBreadth++;
        }*/

        return sceneryCoordinates;
    }

    public List<Tile> getScenery() {
        return this.scenery;
    }

}
