/**
 * This class represents a Jedi, a user of the Force.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Jedi extends Soldier implements ForceSensitive {
    private double power;
    private boolean usedForce = false;
    /**
     * Creates a Jedi, assigning values to
     * Jedi's inherited values.
     * @param health Amount of health this Jedi has.
     * Is between [0, 100].
     * @param attack Attack stat of this Jedi.
     * Is between [0, 100].
     * @param defense Defense stat of this Jedi.
     * Is between [0, 100].
     * @param identifier Letters and numbers that form this
     * Jedi's name.
     */
    public Jedi(double health, double attack, double defense,
        String identifier) {
        super(health, attack, defense, identifier);
        this.power = .25 * this.getDefense();
    }
    /**
     * Makes this Jedi attack its target.
     * Was an abstract method in Soldier.
     * @param target The Soldier this Jedi will attack.
     * @return The amount of damage this Jedi will do.
     */
    public double attack(Soldier target) {
        if (!usedForce) {
            target.hurt(this.getAttack());
            return this.getAttack();
        } else {
            target.hurt(this.getAttack());
            this.changeDefense(-power);
            usedForce = false;
            return this.getAttack();
        }
    }
    /**
     * Grants the Jedi a defense boost.
     */
    public void useTheForce() {
        this.heal(.25 * power);
        this.changeDefense(power);
        usedForce = true;
    }
    /**
     * Returns the Jedi's full name.
     * @return The Jedi's full name.
     */
    @Override
    public String getName() {
        return "Jedi " + getIdentifier();
    }
}