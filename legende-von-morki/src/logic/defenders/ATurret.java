package logic.defenders;

import logic.AGameEntity;

public abstract class ATurret implements ITurret {

    private AGameEntity[] type;
    private boolean alive;

    /**
     * Turret is base for the defenders to stand on. A Turret does not deal any damage.
     * Creates a new turret
     * @param defence array of defenders
     */
    public ATurret(AGameEntity[] defence) {
        int MAXLENGTH = 4;
        System.arraycopy(defence, 0, this.type, 0, MAXLENGTH);
        this.type = defence;
        this.alive = true;
    }

    /**
     * @inheritDoc
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * @inheritDoc
     */
    public int getNumberOfDefenders(AGameEntity[] defence) {
        int re = 0;
        for (AGameEntity amountDefenders : defence) {
            re += 1;
        }
        return re;
    }
    /**
     * @inheritDoc
     */
    public AGameEntity[] getCurrentDefenders() {
        return this.type;
    }

    /**
     * @inheritDoc
     */
    public int getAmountDefenders() {
        return this.type.length;
    }

    /**
     * @inheritDoc
     */
    public int getTotalDefenderDamage() {
        int re = 0;
        for (int i = 0; i <= this.type.length; i++) {
            re += this.type[i].getDmg();
        }
        return re;
    }

    /**
     * @inheritDoc
     */
    public boolean empty() {
        for (int i = 0; i <= this.type.length; i++) {
            if (!this.type[i].isAlive()) {
                return false;
            }
        }
        return true;
    }
}