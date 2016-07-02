/**
 * InvalidItemException gets thrown when an item is invalid.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class InvalidItemException extends Exception {
    /**
     * Creates a new InvalidItemException with the given message.
     */
    public InvalidItemException() {
        super("This item is not valid.");
    }
}