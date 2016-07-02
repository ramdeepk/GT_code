import java.time.LocalDate;
/**
 * Demo runs the code that was written.
 * @author Krishna Ramdeep
 * @version 1.0
 */
public class Demo {
    /**
     * Runs the code.
     * @param args Any command line arguments used.
     * @author Krishna Ramdeep
     * @version 1.0
     */
    public static void main(String[] args) {
        System.out.println("Creating a CheckoutMachine with a valid name.\n");
        CheckoutMachine cm = new CheckoutMachine("TechConvenience");
        System.out.println("Creating an invalid item: a rock with "
            + "weight 23 and barcode 556");
        Item rock = new Item("Rock", 23, 99.08, 556);
        try {
            cm.scan(rock);
        } catch (InvalidItemException e) {
            System.out.println(e.getMessage() + "\n");
        }
        System.out.println("Now creating a valid item: Mac and Cheese.");
        Item macCheese = new Item(1028.8, 9237204);
        try {
            cm.scan(macCheese);
            System.out.println("Mac and Cheese added successfully!\n");
        } catch (InvalidItemException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Now creating another valid item: Ground coffee.");
        Item gCoffee = new Item("Ground Coffee", 961.05, 9.68, 9220570);
        try {
            cm.scan(gCoffee);
            System.out.println("Ground Coffee added successfully!\n");
        } catch (InvalidItemException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Now creating one last valid item: Ramen.");
        Item ramen = new Item("Ramen", 74.84, 17.21, 12);
        try {
            cm.scan(ramen);
            System.out.println("Ramen added successfully!\n");
        } catch (InvalidItemException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Now I'll create a BuzzCard owned by Left Shark "
            + "with a balance of $4.50, a Credit Card owned by Kim Kardashian"
            + " with balance $550.79, and an expiration date of 2011-10-31, "
            + "and a Credit Card owned by Warren Buffett, with balance "
            + "$679,500 and an expiration date of 2016-03-09.\n");
        BuzzCard lShark = new BuzzCard("Left Shark", 4.50);
        CreditCard kardashian = new CreditCard("Kim Kardashian", 550.79,
            LocalDate.of(2011, 10, 31));
        CreditCard buffett = new CreditCard("Warren Buffett", 679500,
            LocalDate.of(2016, 3, 9));
        System.out.println("Can Left Shark pay for the cart?");
        try {
            cm.payForCart(lShark);
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Lol. No.\n");
        System.out.println("Can Kim Kardashian pay for the cart wi"
            + "th an expired card?");
        try {
            cm.payForCart(kardashian);
        } catch (CardExpiredException e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Lol. No.\n");
        System.out.println("Can Warren Buffett pay for the cart?");
        try {
            cm.payForCart(buffett);
            System.out.println("Paid!");
        } catch (CardExpiredException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("What did you expect?\n");
        System.out.println("Lastly, I'll throw the fatal Wrong"
            + "StoreError. Goodbye!");
        CheckoutMachine fatality = new CheckoutMachine("WrongStore!");
    }
}