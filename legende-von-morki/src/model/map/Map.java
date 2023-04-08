package model.map;

import model.AMapObject;
import model.Tile;

import java.util.List;

public class Map {

    private final int WIDTH;
    private final int HEIGHT;

    private Tile[][] field;

    private List<Tile> path;
    private List<AMapObject> currentEntities;

    public Map(int rows, int columns) {
        this.WIDTH = columns;
        this.HEIGHT = rows;

        this.field = new Tile[WIDTH][HEIGHT];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.field[i][j] = new Tile(i, j);
            }
        }
    }

    public Tile getTile(int x, int y) {
        return this.field[x][y];
    }

    /**
     * Creates a list for the path the walking enemies and player units walk on.
     *
     * Always start in the middle. Add a tile and then find out the next tile's coordinates.
     * There is a 20% chance to go either left or right with the next tile.
     *
     * If a tile reaches a certain branching threshold, add the current tile and the one above,
     * then set the next coordinates to the different side and continue.
     *
     * End when the top row is reached and mark all tiles as path.
     */
    public void createNewRandomPath() {
        int currentXPosition = (this.WIDTH / 2);
        int currentYPosition = 0;

        while(currentYPosition <= this.HEIGHT) {
            this.path.add(this.getTile(currentXPosition, currentYPosition));

            if(currentXPosition == this.WIDTH / 3) {
                if(this.path.contains(this.getTile(currentXPosition++, currentYPosition))) { //left border reached
                    currentYPosition++;
                    this.path.add(this.getTile(currentXPosition, currentYPosition));
                    currentXPosition++;
                } else if(this.path.contains(this.getTile(currentXPosition--, currentYPosition))) { //right border reached
                    currentYPosition++;
                    this.path.add(this.getTile(currentXPosition, currentYPosition));
                    currentXPosition--;
                }
            }

            double chance = Math.random();
            if(chance <= 0.2) { //go left
                if(!(this.path.contains(this.getTile(currentXPosition++, currentYPosition)))) currentXPosition++;
            } else if(chance >= 0.8) { //go right
                if(!(this.path.contains(this.getTile(currentXPosition--, currentYPosition)))) currentXPosition--;
            } else { //stay center
                currentYPosition++;
            }
        }
        for (Tile tile : this.path) tile.setPath(true);
    }

    public List<Tile> getPath() {
        return this.path;
    }

    /**
     * Marks 1/12 of the map's tiles as scenery.
     * Never mark a path tile as scenery.
     */
    public void markScenery() {
        for (int i = 0; i < (this.HEIGHT * this.WIDTH) / 12; i++) {

            int randomX = (int) (Math.random() * this.WIDTH);
            int randomY = (int) (Math.random() * this.HEIGHT);

            if (!(this.getTile(randomX, randomY).isPath())) {
                this.getTile(randomX, randomY).setScenery(true);
            }
        }
    }
}
