/**
 * This class represents a RebelSoldier, the basic soldier of the
 * Rebellion.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class RebelSoldier extends Soldier {
    /**
     * Creates a RebelSoldier, assigning values to
     * RebelSoldier's inherited values.
     * @param health Amount of health this RebelSoldier has.
     * Is between [0, 100].
     * @param attack Attack stat of this RebelSoldier.
     * Is between [0, 100].
     * @param defense Defense stat of this RebelSoldier.
     * Is between [0, 100].
     * @param identifier Letters and numbers that form this
     * RebelSoldier's name.
     */
    public RebelSoldier(double health, double attack, double defense,
        String identifier) {
        super(health, attack, defense, identifier);
    }
    /**
     * Makes this RebelSoldier attack its target.
     * Was an abstract method in Soldier.
     * @param target The Soldier this RebelSoldier will attack.
     * @return The amount of damage this RebelSoldier will do.
     */
    public double attack(Soldier target) {
        double willAttack = Math.random();
        if (willAttack < 0.80) {
            target.hurt(this.getAttack());
            return this.getAttack();
        } else {
            return 0.0;
        }
    }
    /**
     * Returns the RebelSoldier's full name.
     * @return The RebelSoldier's full name.
     */
    @Override
    public String getName() {
        return "Rebel Soldier " + getIdentifier();
    }
}