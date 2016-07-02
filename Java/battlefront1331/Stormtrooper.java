/**
 * This class represents a Stormtrooper, the basic Soldier of the Empire.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Stormtrooper extends Soldier {
    /**
     * Creates a Stormtrooper, assigning values to
     * Stormtrooper's inherited values.
     * @param health Amount of health this Stormtrooper has.
     * Is between [0, 100].
     * @param attack Attack stat of this Stormtrooper.
     * Is between [0, 100].
     * @param defense Defense stat of this Stormtrooper.
     * Is between [0, 100].
     * @param identifier Letters and numbers that form this
     * Stormtrooper's name.
     */
    public Stormtrooper(double health, double attack, double defense,
        String identifier) {
        super(health, attack, defense, identifier);
    }
    /**
     * Makes this Stormtrooper attack its target.
     * Was an abstract method in Soldier.
     * @param target The Soldier this Stormtrooper will attack.
     * @return The amount of damage this Stormtrooper will do.
     */
    public double attack(Soldier target) {
        double willAttack = Math.random();
        if (willAttack < 0.60) {
            target.hurt(this.getAttack() * 1.25);
            return this.getAttack() * 1.25;
        } else {
            return 0.0;
        }
    }
    /**
     * Returns the Stormtrooper's full name.
     * @return The Stormtrooper's full name.
     */
    @Override
    public String getName() {
        return "Stormtrooper " + getIdentifier();
    }
}