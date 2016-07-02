/**
 * This class represents a Rebel Medic, a weak soldier that heals himself a
 * little when he attacks, and a lot when he doesn't.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Rebel extends RebelSoldier {
    private static final double HEAL_FACTOR = 70.00;
    /**
     * Creates a Rebel Medic, assigning values to
     * Rebel Medic's inherited values.
     * @param health Amount of health this Rebel Medic has.
     * Is between [0, 100].
     * @param attack Attack stat of this Rebel Medic.
     * Is between [0, 100].
     * @param defense Defense stat of this Rebel Medic.
     * Is between [0, 100].
     * @param identifier Letters and numbers that form this
     * Rebel Medic's name.
     */
    public Rebel(double health, double attack, double defense,
        String identifier) {
        super(health, attack, defense, identifier);
    }
    /**
     * Makes this Rebel Medic attack its target.
     * Was an abstract method in Soldier.
     * @param target The Soldier this Rebel Medic will attack.
     * @return The amount of damage this Rebel Medic will do.
     */
    public double attack(Soldier target) {
        double willAttack = Math.random();
        if (willAttack < 0.40) {
            target.hurt(this.getAttack());
            this.heal(HEAL_FACTOR / 2);
            return this.getAttack();
        } else {
            this.heal(HEAL_FACTOR);
            return 0.0;
        }
    }
    /**
     * Returns the Rebel Medic's full name.
     * @return The Rebel Medic's full name.
     */
    @Override
    public String getName() {
        return "Rebel Medic " + getIdentifier();
    }
}