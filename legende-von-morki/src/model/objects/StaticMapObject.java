package model.objects;

import model.map.Tile;

/**
 * Towers, Scenery and Ruins
 */
public class StaticMapObject extends AMapObject {

    /**
     * Only place placeable objects on empty tiles
     * @param position spawn location
     */
    @Override
    public void place(Tile position) {
        if (this.isPlaceable() && position.isEmpty()) {
            position.addObject(this);
        }
    }
}
