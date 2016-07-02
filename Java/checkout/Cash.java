/**
 * Cash: the simplest PaymentMethod.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Cash implements PaymentMethod {
    private double cashOnHand;
    /**
     * Creates a new Cash object.
     * @param cashOnHand The amount of cash the user possesses.
     */
    public Cash(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }
    /**
     * Pays the amount due with Cash, if there is enough.
     * @param amount The amount due.
     * @throws PaymentFailedException
     */
    @Override
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= cashOnHand) {
            System.out.println("You have successfully paid with cash!");
            cashOnHand = cashOnHand - amount;
        } else {
            System.out.println("Not enough funds!");
            throw new NotEnoughFundsException("This item costs $" + amount
                + ". You have just $" + cashOnHand + " in cash.");
        }
    }
}