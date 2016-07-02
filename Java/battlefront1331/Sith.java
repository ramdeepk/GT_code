/**
 * This class represents a Sith, a user of the Force.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Sith extends Soldier implements ForceSensitive {
    private double power;
    private boolean usedForce = false;
    /**
     * Creates a Sith, assigning values to
     * Sith's inherited values.
     * @param health Amount of health this Sith has.
     * Is between [0, 100].
     * @param attack Attack stat of this Sith.
     * Is between [0, 100].
     * @param defense Defense stat of this Sith.
     * Is between [0, 100].
     * @param identifier Letters and numbers that form this
     * Sith's name.
     */
    public Sith(double health, double attack, double defense,
        String identifier) {
        super(health, attack, defense, identifier);
        this.power = (this.getAttack() + this.getDefense()) / 6;
    }
    /**
     * Makes this Sith attack its target.
     * Was an abstract method in Soldier.
     * @param target The Soldier this Sith will attack.
     * @return The amount of damage this Sith will do.
     */
    public double attack(Soldier target) {
        if (!usedForce) {
            target.hurt(this.getAttack());
            return this.getAttack();
        } else {
            target.hurt(this.getAttack());
            this.changeAttack(-power);
            usedForce = false;
            return this.getAttack();
        }
    }
    /**
     * Grants the Sith a defense boost.
     */
    public void useTheForce() {
        this.hurt(.10 * power);
        this.changeAttack(power);
        usedForce = true;
    }
    /**
     * Returns the Sith's full name.
     * @return The Sith's full name.
     */
    @Override
    public String getName() {
        return "Sith " + getIdentifier();
    }
}