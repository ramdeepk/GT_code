/**
 * Represents a Custom card.
 *
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class CustomCard extends Card {
    /**
     * Constructs a custom Card.
     */
    public CustomCard() {
        super("King Keeble", "Worth 4 Keebles.",
            "The King of Keebles, worth an incredible amount.",
            false, 4);
    }
    /**
     * Plays this card
     * @param p the current game
     */
    public void play(PlasterClash p) {
        super.play(p);
        playToPlayZone(p);
        p.incKeebles();
        p.incKeebles();
    }
}