package Game.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBoard {

    private static final int SIZE = 10;
    private final Tile[][] board;
    private ArrayList<Tile> path = new ArrayList<>();

    public GameBoard() {
        int count = 0;

        board = new Tile[SIZE][SIZE];
        for(Tile[] t : board) {
            for(int i = 0; i < SIZE; i++) {
                board[count][i] = new Tile();
            }
            count++;
        }

        //generate the Path for the enemies to walk along
        Random rand = new Random();
        int pathY = rand.nextInt(SIZE);

        for (int x = SIZE - 1; x >= 0; x--) {
            board[x][pathY].setType('p');
            path.add(board[x][pathY]);

            if (x > 0) {
                if (rand.nextInt(100) < 30) { // 30% chance to move left or right
                    int direction = rand.nextBoolean() ? -1 : 1;
                    pathY = Math.max(0, Math.min(SIZE - 1, pathY + direction));
                }
            }
        }

        //generate scenery on the field
        rand = new Random();
        int sceneryCount = 0;

        while (sceneryCount < 15) {
            int x = rand.nextInt(SIZE);
            int y = rand.nextInt(SIZE);

            if (board[x][y].getType() != 'p') {
                board[x][y].setType('s');
                sceneryCount++;
            }
        }
    }

    public Tile getTileFromCoordinates(int x, int y) {
        return board[x][y];
    }

    public List<Tile> getPath() {
        return this.path;
    }

    //Test: fills the Array with 8 Tile-entities, not confirmed if the coordinates match up
    public Tile[] getSurroundingTiles(int x, int y) {
        Tile[] surroundingTiles = new Tile[8];
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 && newX < SIZE && newY >= 0 && newY < SIZE) {
                surroundingTiles[i] = (board[newX][newY]);
            }
        }
        return surroundingTiles;
    }

}
