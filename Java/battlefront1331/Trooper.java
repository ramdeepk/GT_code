/**
 * This class represents a Imperial Sniper, marksmen that can
 * kill a Rebel in one hit.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Trooper extends Stormtrooper {
    /**
     * Creates a Imperial Sniper, assigning values to
     * Imperial Sniper's inherited values.
     * @param health Amount of health this Imperial Sniper has.
     * Is between [0, 100].
     * @param attack Attack stat of this Imperial Sniper.
     * Is between [0, 100].
     * @param defense Defense stat of this Imperial Sniper.
     * Is between [0, 100].
     * @param identifier Letters and numbers that form this
     * Imperial Sniper's name.
     */
    public Trooper(double health, double attack, double defense,
        String identifier) {
        super(health, attack, defense, identifier);
    }
    /**
     * Makes this Imperial Sniper attack its target.
     * Was an abstract method in Soldier.
     * @param target The Soldier this Imperial Sniper will attack.
     * @return The amount of damage this Imperial Sniper will do.
     */
    public double attack(Soldier target) {
        double willAttack = Math.random();
        if (willAttack < 0.85) {
            target.hurt(this.getAttack());
            return this.getAttack();
        } else if (willAttack >= 0.85 && willAttack < 0.95) {
            target.hurt(target.getHealth());
            return target.getHealth();
        } else {
            this.changeDefense(-30.00);
            return 0.0;
        }
    }
    /**
     * Returns the Imperial Sniper's full name.
     * @return The Imperial Sniper's full name.
     */
    @Override
    public String getName() {
        return "Imperial Sniper " + getIdentifier();
    }
}
