import model.map.Map;
import model.map.SetOfCoordinates;
import model.map.Tile;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Map map = new Map(10, 10);

        List<Tile> path = map.getPath();
        //List<SetOfCoordinates> potentialScenery = map.getScenery();

        for (Tile tile : path) {
            System.out.println(tile.getID() + " / " + tile.getCoordinates().show());
            System.out.println(tile.isPath());
        }


        /*for (int i = 0; i < potentialScenery.size(); i++) {
            System.out.print(path.get(i).getX() + ", " + path.get(i).getY() + "  /  ");
            System.out.println(potentialScenery.get(i).getX() + ", " + potentialScenery.get(i).getY());
        }*/
    }
}
