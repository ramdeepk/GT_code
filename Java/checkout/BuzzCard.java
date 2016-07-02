/**
 * BuzzCard is a Card with a balance and an owner name.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class BuzzCard extends Card {
    /**
     * Creates a BuzzCard with an ownerName and balance.
     * @param ownerName The name of the person that owns this BuzzCard.
     * @param balance The mone left on this BuzzCard.
     */
    public BuzzCard(String ownerName, double balance) {
        super(ownerName, balance);
    }
}