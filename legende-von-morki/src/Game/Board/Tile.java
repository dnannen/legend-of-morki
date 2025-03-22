package Game.Board;

import Game.Objects.GameObject;

import java.util.ArrayList;
import java.util.List;

public class Tile {

    private List<GameObject> objects;

    //n - not assigned, s - scenery, p - path, e - empty
    private char type;

    public Tile() {
        this.objects = new ArrayList<>();
        this.type = 'n';
    }

    public void placeGameObject(GameObject object) {
        if (object.isSpawnable()) this.objects.add(object);
    }

    public List<GameObject> getAllObjects() {
        return this.objects;
    }

    public void removeGameObject (GameObject object) {
        objects.remove(object);
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
