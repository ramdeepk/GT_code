/**
 * Item class represents an item, having name, weight, price, and barcode.
 * @author Alex Epifano and Thomas Shields
 * @version 1.0
 */
public class Item {

    private String name;
    private double weight;
    private double price;
    private long barcode;

    /**
     * Creates a new item with the specified weight and barcode. Initializes
     * name as null and price as 0.0.
     * @param  weight  The weight in grams of the item.
     * @param  barcode The barcode of the item.
     */
    public Item(double weight, long barcode) {
        this(null, weight, 0.0, barcode);
    }

    /**
     * Create new item with the specified properties.
     * @param  name    The name of the item.
     * @param  weight  The weight of the item in grams.
     * @param  price   The price of the item in USD.
     * @param  barcode The barcode of the item.
     */
    public Item(String name, double weight, double price, long barcode) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.barcode = barcode;
    }
    /**
     * Returns the price of this Item.
     * @return The price of this Item.
     */
    public double getPrice() {
        return this.price;
    }
    /**
     * Returns whether the two items are equal.
     * @param other The thing to compare.
     * @return The item's equality to other.
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } else {
            return ((this.weight == ((Item) other).weight)
                && (this.barcode == ((Item) other).barcode)) ? true : false;
        }
    }
}
