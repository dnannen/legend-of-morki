package logic;

import logic.field.GameField;

public interface IGameEntity {

    /**
     * Gets the current amount of hp
     * @return current hp
     */
    int getHp();

    /**
     * Sets the new hp of an entity
     * @param hp new hp
     */
    void setHp(int hp);

    /**
     * Gets the current damage an entity is capable of
     * @return current damage
     */
    int getDmg();

    /**
     * Sets the damage of an entity, e.g. after a buff
     * @param dmg new dmg
     */
    void setDmg(int dmg);

    /**
     * Gets the current speed of an entity
     * @return current speed
     */
    int getSpeed();

    /**
     * Sets the new speed of an entity
     * @param speed new speed
     */
    void setSpeed(int speed);

    /**
     * Gets the Attackspeed of a certain entity
     * @return attackspeed
     */
    double getAttackspeed();

    /**
     * Sets Attackspeed, e.g. after a buff
     * @param attackspeed new speed
     */
    void setAttackspeed(double attackspeed);

    /**
     * Gets the Armor of a certain entity
     * @return armor
     */
    int getArmor();

    /**
     * Sets the new Armor of a certain entity
     * @param armor new armor
     */
    void setArmor(int armor);

    /**
     * Gets the AP of a certain entity
     * @return AP
     */
    int getAP();

    /**
     * Sets the AP of a certain entity
     * @param AP new AP
     */
    void setAP(int AP);

    /**
     * Gets the State of an entity
     * @return alive?
     */
    boolean isAlive();

    /**
     * Sets current status
     * @param alive current status
     */
    void setAlive(boolean alive);

    /**
     * Does the attacker deal aoe damage?
     * @return aoe?
     */
    boolean isAoe();

    /**
     * Sets if the attacker deals area of effect damage.
     * @param aoe ?
     */
    void setAoe(boolean aoe);

    /**
     * Gets the current tile of this entity
     * @return current tile
     */
    Tile getCurrentPos();

    /**
     * Sets a new field for this entity.
     * @param gamefield new field
     */
    void setField(GameField gamefield);

    /**
     * Gets the Field this entity is present on.
     * @return present field
     */
    GameField getField();

    /**
     * Gets the tiles in ultimate vicinity packed in an array,
     * from top first clockwise to top left
     *
     * @return array of tiles
     */
    Tile[] getAdjacentTiles(int x, int y);
}
