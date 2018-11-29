package logic.field;

public class GameField implements IGameField {

    private Tile[] path; //TODO
    private Tile[][] tiles;

    public GameField() {
        this.tiles = new Tile[10][10];
        this.initialize();
    }

    public void initialize() {
        //x coordinate
        for (int i = 0; i < 10; i++) {
            //y coordinate
            for (int j = 0; j < 10; j++) {
                if (tiles[i][j].empty()) {
                    this.tiles[i][j] = new Tile(i, j);
                }
            }
        }
    }

    public Tile getTileFromCoords(int x, int y) {
        for (int i = 0; i < tiles.length; i++) {
            int j = 0;
            if (j == y && i == x) {
                return tiles[i][j];
            }
        }
        return null;
    }
}
