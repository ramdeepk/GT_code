/**
 * Represents a Gnome card.
 *
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Gnome extends Card {
    /**
     * Constructs a Gnome Card.
     */
    public Gnome() {
        super("Gnome", "Worth Points at the end of the game!",
            "A creature that is as rare as it is malicious.",
            true, 4);
    }
    /**
     * Plays this card
     * @param p the current game
     */
    public void play(PlasterClash p) {
        p.currentPlayer().discardCard(this);
    }
}