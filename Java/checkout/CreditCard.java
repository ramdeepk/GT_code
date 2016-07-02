import java.time.LocalDate;
/**
 * A Card with a balance, an owner name, and expiration date.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class CreditCard extends Card {
    private LocalDate expirationDate;
    /**
     * Creates a CreditCard with an ownerName, balance, and exp. date.
     * @param ownerName The name of the person that owns this CreditCard.
     * @param balance The money left on this card.
     * @param expirationDate The expiry date of this card.
     */
    public CreditCard(String ownerName, double balance,
        LocalDate expirationDate) {
        super(ownerName, balance);
        this.expirationDate = expirationDate;
    }
    /**
     * Pays the amount due with this Card, if possible.
     * @param amount The amount due.
     * @throws PaymentFailedException
     */
    @Override
    public void pay(double amount) throws PaymentFailedException {
        if (LocalDate.now().isAfter(expirationDate)) {
            throw new CardExpiredException(expirationDate);
        } else {
            super.pay(amount);
        }
    }
}