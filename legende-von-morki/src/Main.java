import model.map.Map;
import model.map.Tile;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Map map = new Map(10, 10);

        List<Tile> path = map.getPath();
        List<Tile> scenery = map.getScenery();

        /*for (int i = 0; i < map.size(); i++) {
            System.out.println(map.getTileFromID(i).getCoordinates());
        }*/

        /*for (Tile tile : path) {
            System.out.println(tile.getCoordinates());
            System.out.println(tile.isPath());
        }*/

        for (Tile tile : scenery) {
            System.out.println(tile.getCoordinates());
        }
    }
}
