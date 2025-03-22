package Game.Logic;

import Game.Board.GameBoard;

public class Game {

    private static GameBoard gameBoard = new GameBoard();

    //Test: successfully generates a field of 10 x 10 with a Tile in each place
    //Test #2: successfully generates a path from bottom to top
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + gameBoard.getTileFromCoordinates(i, j).getType() + "] ");
            }
            System.out.println();
        }
    }

}
