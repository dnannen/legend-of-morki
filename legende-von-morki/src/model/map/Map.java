package model.map;

import java.util.ArrayList;
import java.util.List;

public class Map implements IMap {

    private List<Tile> tiles = new ArrayList<>();

    private final int DEPTH;
    private final int WIDTH;

    //TODO create a new path, that is the reverse of this one for the enemies/allies
    //private List<Tile> enemiesPath;
    //private List<Tile> alliesPath;
    private List<Tile> path;
    private List<Tile> scenery;

    public Map(int xLength, int yWidth) {
        this.DEPTH = xLength;
        this.WIDTH = yWidth;
        this.create();
    }

    @Override
        public void create() {
        int x = 1;
        int y = 1;
        int tileID = 0;

        while (true) {
            this.tiles.add(new Tile(tileID, x, y));
            tileID++;

            y++;
            if (y > WIDTH) {
                y = 1;
                x++;
                if (x > DEPTH) break;
            }
        }
        this.path = createPath();
        for (Tile value : this.path) {
            value.setPathTile(true);
        }

        this.scenery = markScenery();
        for (Tile value : this.scenery) {
            value.setSceneryTile(true);
        }

    }

    @Override
    public int size() {
        return this.tiles.size();
    }

    @Override
    public Tile getTile(int x, int y) {
        return this.tiles.get((x * 10 + y) - 11);
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
        pathTiles.add(this.getTile(currentDepth, currentBreadth));

        while (currentDepth < this.WIDTH) {
            double strayChance = Math.random() * 100;

            if (strayChance <= 30 && rightStray < MAX_STRAY) {
                rightStray++;
                currentBreadth++;

                pathTiles.add(this.getTile(currentDepth, currentBreadth));
                pathTiles.add(this.getTile(currentDepth + 1, currentBreadth));
                currentDepth++;
            } else if (strayChance >= 70 && leftStray < MAX_STRAY) {
                leftStray++;
                currentBreadth--;

                pathTiles.add(this.getTile(currentDepth, currentBreadth));
                pathTiles.add(this.getTile(currentDepth + 1, currentBreadth));
                currentDepth++;
            } else {
                currentDepth++;
                pathTiles.add(this.getTile(currentDepth, currentBreadth));
            }
        }
        return pathTiles;

    }

    public List<Tile> getPath() {
        return this.path;
    }

    @Override
    public List<Tile> markScenery() {
        int currentDepth = 1;
        int currentBreadth;

        List<Tile> possibleTiles = new ArrayList<>();
        List<Tile> sceneryTiles = new ArrayList<>();

        for (Tile tile : path) {
            while (currentDepth <= this.DEPTH) {

                currentBreadth = tile.getCoordinates().get(1) - 3;
                while (currentBreadth >= 1) {
                    possibleTiles.add(this.getTile(currentDepth, currentBreadth));
                     currentBreadth--;
                }

                currentBreadth = tile.getCoordinates().get(1) + 3;
                while (currentBreadth <= 10) {
                    possibleTiles.add(this.getTile(currentDepth, currentBreadth));
                    currentBreadth++;
                }
                currentDepth++;

            }
        }

        //TODO
        /*for (int i = 0; i < 6; i++) {
            int random = (int) (Math.random() * 6);
            sceneryTiles.add(random, possibleTiles.get(random));
        }*/

        return possibleTiles;
        //return sceneryTiles;
    }

    public List<Tile> getScenery() {
        return this.scenery;
    }

}
