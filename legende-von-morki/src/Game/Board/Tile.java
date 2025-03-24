package Game.Board;

import Game.Objects.ActiveGameObject;

import java.util.ArrayList;
import java.util.List;

public class Tile {

    private List<ActiveGameObject> objects;

    //n - not assigned, s - scenery, p - path, e - empty
    private char type;

    public Tile() {
        this.objects = new ArrayList<>();
        this.type = 'n';
    }

    public void placeGameObject(ActiveGameObject object) {
        this.objects.add(object);
    }

    public List<ActiveGameObject> getAllObjects() {
        return this.objects;
    }

    public void removeGameObject (ActiveGameObject object) {
        objects.remove(object);
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
