package Game.Board;

import Game.Objects.IActiveGameObject;

import java.util.ArrayList;
import java.util.List;

public class Tile {

    private List<IActiveGameObject> objects;

    //n - not assigned, s - scenery, p - path, e - empty
    private char type;

    public Tile() {
        this.objects = new ArrayList<>();
        this.type = 'n';
    }

    public void placeGameObject(IActiveGameObject object) {
        this.objects.add(object);
    }

    public List<IActiveGameObject> getAllObjects() {
        return this.objects;
    }

    public void removeGameObject (IActiveGameObject object) {
        objects.remove(object);
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
