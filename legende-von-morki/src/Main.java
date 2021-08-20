import model.map.Map;
import model.map.Tile;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        Map map = new Map(10, 10);
        List<Tile> surrounds = map.getTile(1, 10).getSurroundingTiles(map);

        for (Tile tile : surrounds) {
            System.out.println(tile.getID());
            System.out.println(tile.getCoordinates());
        }
    }
}
