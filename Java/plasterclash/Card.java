/**
 * Represents a Card.
 *
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Card implements Comparable<Card> {
    private String name, description, flavorText;
    private int cost;
    private boolean isGnome;
    /**
     * Constructs a Card.
     * @param name The name of the card
     * @param description the Card's description
     * @param flavorText the Card's flavorText
     * @param isGnome whether or not this card is scorable
     * @param cost the card's cost
     */
    public Card(String name, String description, String flavorText,
        boolean isGnome, int cost) {
        this.name = name;
        this.description = description;
        this.flavorText = flavorText;
        this.isGnome = isGnome;
        this.cost = cost;
    }
    /**
     * Get the Card's name.
     * @return the Card's name
     */
    public String getName() {
        return this.name;
    }
    /**
     * Get the Card's description.
     * @return the Card's description.
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Get the Card's flavorText.
     * @return the Card's flavorText
     */
    public String getFlavorText() {
        return this.flavorText;
    }
    /**
     * Get the Card's gnome status.
     * @return the Card's gnome status
     */
    public boolean isScorable() {
        return this.isGnome;
    }
    /**
     * Get the Card's cost.
     * @return the Card's cost
     */
    public int getCost() {
        return this.cost;
    }
    /**
     * Play the Card.
     * @param p PlasterClash game
     */
    public void play(PlasterClash p) {
        p.currentPlayer().discardCard(this);
    }
    /**
     * Put the cards in the playZone.
     * @param p the current game
     */
    public void playToPlayZone(PlasterClash p) {
        p.getPlayZone().add(this);
    }
    /**
     * String representation
     * @return string representation
     */
    public String toString() {
        String cardView = this.name + " (" + this.cost + ")";
        return cardView;
    }
    /**
     * Card equality.
     * @param other another card
     * @return whether this Card is equal to another
     */
    public boolean equals(Object other) {
        return this.name.equals(((Card) other).getName());
    }
    /**
     * Card comparison.
     * @param c another card
     * @return negative int (less than), 0 (equal), positive int (greater than)
     */
    public int compareTo(Card c) {
        return this.name.compareTo(c.getName());
    }
    /**
     * Card hashCode.
     * @return a unique hashCode for this card
     */
    public int hashCode() {
        return this.name.hashCode();
    }
}