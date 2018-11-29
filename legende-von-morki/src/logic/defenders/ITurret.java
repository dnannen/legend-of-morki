package logic.defenders;

import logic.AGameEntity;

public interface ITurret {

    /**
     * Gets the State of a turret
     * @return alive?
     */
    boolean isAlive();

    /**
     * Returns number of current soldiers, after getting the array of current types of soldiers.
     * @param defence current array of soldiers
     * @return current number of soldiers
     */
    int getNumberOfDefenders(AGameEntity[] defence);

    /**
     * Gets the current defenders on the turret
     * @return current defenders
     */
    AGameEntity[] getCurrentDefenders();

    /**
     * Sets the array of defenders to a new one
     * @param currentDefenders new defenderArray
     */
    void setCurrentDefenders(AGameEntity[] currentDefenders);

    /**
     * Gets the total amount of defenders on the turret
     * @return current amount of defenders
     */
    int getAmountDefenders();

    /**
     * Calculates the total amount of damage of all defenders on the turret
     * @return total amount of damage
     */
    int getTotalDefenderDamage();

    /**
     * Determines if the turret is empty
     * @return empty?
     */
     boolean empty();
}
