package logic.field;

public interface IGameField {

    /**
     * Initializes the gamefield with all it needs
     */
    void initialize();

    /**
     * Gets the tile back from coordinates.
     * @param x x-Coord
     * @param y y-Coord
     * @return Tile
     */
    Tile getTileFromCoords(int x, int y);
}
