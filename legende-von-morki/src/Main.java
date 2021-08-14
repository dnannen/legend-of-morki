import model.map.Map;
import model.map.SetOfCoordinates;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Map map = new Map(10, 10);
        List<SetOfCoordinates> path = map.getPath();
        List<SetOfCoordinates> potentialScenery = map.getScenery();

        for (int i = 0; i < potentialScenery.size(); i++) {
            System.out.print(path.get(i).getX() + ", " + path.get(i).getY() + "  /  ");
            System.out.println(potentialScenery.get(i).getX() + ", " + potentialScenery.get(i).getY());
        }
    }
}
