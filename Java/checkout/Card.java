/**
 * A Card with a balance and an owner name.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public abstract class Card implements PaymentMethod {
    private double balance;
    private String ownerName;
    /**
     * Creates a Card with an ownerName and balance.
     * @param ownerName The name of the person that owns this Card.
     * @param balance The money left on this Card.
     */
    public Card(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }
    /**
     * Pays the amount due with this Card.
     * @param amount The amount due.
     * @throws PaymentFailedException
     */
    @Override
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= balance) {
            System.out.println("You have successfully paid with your card!");
            balance = balance - amount;
        } else {
            System.out.println("Not enough funds!");
            throw new NotEnoughFundsException("This item costs $" + amount
                + ". You have just $" + balance + " left on your card.");
        }
    }
}