package model.objects;

import model.map.Tile;

public abstract class AMapObject {

    private String type;
    private boolean isPlaceable;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPlaceable() {
        return isPlaceable;
    }

    public void setPlaceable(boolean placeable) {
        isPlaceable = placeable;
    }


    public abstract void place(Tile position);

}
