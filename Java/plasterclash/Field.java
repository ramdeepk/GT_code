import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
/**
 * Represents a Field.
 *
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Field {
    private HashMap<Card, Integer> listCards = new HashMap<>();
    /**
     * Creates a field
     */
    public Field() {
        listCards.put(new GardenBread(), 1);
        listCards.put(new Gnome(), 2);
        listCards.put(new CustomCard(), 1);
    }
    /**
     * Buys a card.
     * @param c the card to be bought
     */
    public void buyCard(Card c) {
        if (c instanceof Gnome && listCards.get(c) > 10) {
            listCards.replace(c, listCards.get(c) - 1);
        } else if (!(c instanceof GardenBread)) {
            listCards.replace(c, listCards.get(c) - 1);
        }
    }
    /**
     * Returns the list of cards.
     * @return the list of Cards.
     */
    public ArrayList<Card> cards() {
        Iterator<Card> it = listCards.keySet().iterator();
        ArrayList<Card> c = new ArrayList<>();
        while (it.hasNext()) {
            Card x = it.next();
            if (listCards.get(x) != 0) {
                c.add(x);
            }
        }
        Collections.sort(c);
        return c;
    }
}