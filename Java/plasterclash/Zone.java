import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 * Represents a Zone.
 *
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Zone implements Iterable<Card> {
    private ArrayList<Card> cardList;
    /**
     * Creates a Zone.
     */
    public Zone() {
        this.cardList = new ArrayList<Card>();
    }
    /**
     * Returns the list of cards.
     * @return the list of Cards.
     */
    public ArrayList<Card> getCards() {
        return this.cardList;
    }
    /**
     * Returns the card at a specific index.
     * @param index the index of the card
     * @return the card at the index
     */
    public Card get(int index) {
        return this.cardList.get(index);
    }
    /**
     * Adds a card to the backing list
     * @param c the card to be added
     */
    public void add(Card c) {
        this.cardList.add(c);
    }
    /**
     * Adds a list of cards to the backing list
     * @param c the list of cards to be added
     */
    public void addCards(ArrayList<Card> c) {
        this.cardList.addAll(c);
    }
    /**
     * Removes a card to the backing list
     * @param c the card to be removed
     */
    public void remove(Card c) {
        this.cardList.remove(c);
    }
    /**
     * Removes a card to the backing list
     * @param index the index of the card to be removed
     * @return the card that was removed
     */
    public Card remove(int index) {
        return this.cardList.remove(index);
    }
    /**
     * Removes all cards and returns the cards that were removed
     * @return the list of removed cards
     */
    public ArrayList<Card> discardAll() {
        ArrayList<Card> used = this.cardList;
        this.cardList.clear();
        return used;
    }
    /**
     * Checks if Card is in in the Zone
     * @param c the card to check for
     * @return if the crad is in the Zone
     */
    public boolean contains(Card c) {
        return this.cardList.contains(c);
    }
    /**
     * String representation
     * @return String representation
     */
    public String toString() {
        String zone = "";
        for (Card c: cardList) {
            zone = zone + c.toString() + "\n";
        }
        return zone;
    }
    /**
     * Shuffles cards
     */
    public void shuffle() {
        Collections.shuffle(this.cardList);
    }
    /**
     * Moves card to new Zone
     * @param z the new Zone
     */
    public void moveCardsTo(Zone z) {
        z.getCards().addAll(this.getCards());
    }
    /**
     * The number of cards in the zone
     * @return cards in the zone
     */
    public int size() {
        return this.cardList.size();
    }
    /**
     * Number of Gnomes in the zone
     * @return number of gnomes
     */
    public int numGnomes() {
        int gnomes = 0;
        for (Card c: cardList) {
            if (c instanceof Gnome) {
                gnomes++;
            }
        }
        return gnomes;
    }
    /**
     * Gives an iterator
     * @return an iterator
     */
    public Iterator<Card> iterator() {
        return this.cardList.iterator();
    }
}