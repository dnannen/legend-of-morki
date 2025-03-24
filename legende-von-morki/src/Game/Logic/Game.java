package Game.Logic;

import Game.Board.GameBoard;
import Game.Objects.ActiveGameObject;
import Game.Objects.Enemies.EnemyUnit;
import Game.Objects.Friendlies.FriendlyUnit;

public class Game {

    private static GameBoard gameBoard;

    public Game() {
        gameBoard = new GameBoard();
    }

    public static void spawnActiveGameUnit(ActiveGameObject unit) {
        if (unit instanceof EnemyUnit) {
            //Enemies always spawn at the top of the board
            gameBoard.getPath().get(gameBoard.getPath().size() - 1).placeGameObject(unit);
        } else if (unit instanceof FriendlyUnit) {
            //Friendlies are spawned at the bottom of the board
            gameBoard.getPath().get(0).placeGameObject(unit);
        } else {
            return;
        }
    }

    public void moveActiveGameUnit() {
        //TODO move speed is congruent to the number of seconds the unit needs to traverse one tile
    }

    //Test: successfully generates a field of 10 x 10 with a Tile in each place
    //Test #2: successfully generates a path from bottom to top
    public static void main(String[] args) {
        Game test = new Game();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + gameBoard.getTileFromCoordinates(i, j).getType() + "] ");
            }
            System.out.println();
        }
        spawnActiveGameUnit(new EnemyUnit(1, 1));
        spawnActiveGameUnit(new FriendlyUnit(3, 3));
    }
}
