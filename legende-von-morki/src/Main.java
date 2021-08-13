import model.map.Map;
import model.map.SetOfCoordinates;
import model.map.Tile;

import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map map = new Map(10, 10);
        map.create();
        map.createPath();
        HashMap<SetOfCoordinates, Tile> test = map.getPath();

        Set<SetOfCoordinates> keys = test.keySet();

        for (SetOfCoordinates f : keys) {
            System.out.println(f.getX() + ", " + f.getY());
        }
    }


}
