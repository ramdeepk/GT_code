import java.util.ArrayList;
/**
 * The class that handles the actual functions of the machine.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class CheckoutMachine {
    private String storeName;
    private ArrayList<Item> validItems;
    private ArrayList<Item> cart = new ArrayList<Item>();
    /**
     * Creates a new CheckoutMachine object.
     * @param storeName The name of the store.
     */
    public CheckoutMachine(String storeName) {
        boolean didWeGetValidItems = false, validName = false;
        while (!didWeGetValidItems) {
            try {
                validItems = Server.getValidItems();
                didWeGetValidItems = !didWeGetValidItems;
            } catch (ServerException e) {
                System.out.println("Caught ServerException!");
            }
        }
        while (!validName) {
            try {
                if (!Server.isStoreNameValid(storeName)) {
                    throw new WrongStoreError("Fatal Error! Store name inv"
                        + "alid!");
                } else {
                    this.storeName = storeName;
                    validName = true;
                }
            } catch (ServerException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    /**
     * Adds item to the cart if it is valid.
     * @param item The item to be bought.
     * @throws NotEnoughFundsException
     */
    public void scan(Item item) throws InvalidItemException {
        if (!validItems.contains(item)) {
            throw new InvalidItemException();
        } else {
            for (int i = 0; i < validItems.size(); i++) {
                if (validItems.get(i).equals(item)) {
                    cart.add(validItems.get(i));
                }
            }
        }
    }
    /**
     * Returns price of the cart.
     * @return Price of the cart.
     */
    public double getTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < cart.size(); i++) {
            total = total + cart.get(i).getPrice();
        }
        return total;
    }
    /**
     * Attempts to pay for the cart.
     * @param method Method used to pay.
     */
    public void payForCart(PaymentMethod method) throws PaymentFailedException {
        method.pay(this.getTotalPrice());
        cart.clear();
    }
}