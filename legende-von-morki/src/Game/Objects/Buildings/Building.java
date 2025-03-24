package Game.Objects.Buildings;

import Game.Board.Tile;

public class Building {

    //TODO very bland atm, implement later
    private Tile location;
    private Integer health;

    public Building(Tile t, int h) {
        this.location = t;
        this.health = h;
    }
}
