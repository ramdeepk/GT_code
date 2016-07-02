/**
 * NotEnoughFundsException gets thrown when a payment cannot be made.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class NotEnoughFundsException extends PaymentFailedException {
    /**
     * Creates a new NotEnoughFundsException with the given message.
     * @param  msg The message of the exception.
     */
    public NotEnoughFundsException(String msg) {
        super(msg);
    }
}