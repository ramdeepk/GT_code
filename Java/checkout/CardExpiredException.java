import java.time.LocalDate;
/**
 * CardExpiredException gets thrown by a CreditCard
 * when a it is expired and used.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class CardExpiredException extends PaymentFailedException {
    private LocalDate expiryDate;
    /**
     * Creates a new CardExpiredException that gives the card expired date.
     * @param  expiryDate The date the CreditCard expired.
     */
    public CardExpiredException(LocalDate expiryDate) {
        super("This card expired on " + expiryDate.toString());
    }
}