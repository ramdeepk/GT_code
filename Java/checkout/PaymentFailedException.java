/**
 * PaymentFailedException gets thrown when a payment cannot be made.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class PaymentFailedException extends Exception {
    /**
     * Creates a new PaymentFailedException with the given message.
     * @param  msg The message of the exception.
     */
    public PaymentFailedException(String msg) {
        super(msg);
    }
    /**
     * Creates a new PaymentFailedException.
     */
    public PaymentFailedException() {
        super();
    }
}