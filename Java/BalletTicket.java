// Write a class named BalletTicket whose single public constructor takes a String argument named section which can be either orchestra or 
// mezzanine, and an int argument named age which specifies the cutomer's age. If the user passes in a string other than those two section 
// options, the constructor should default to orchestra and print an informative message indicating the invalid input and default choice. 
// Include two more public methods in the class: getSection(), which returns a String reporting the section for this ticket, and getPrice() 
// which returns a double ticket price calculated according to the following rules:

// An orchestra seat is $50.00.
// A mezzanine seat is $40.00.
// Senior citizens (65 and older) receive a 10% discount.
// Tax for everyone is 5%, which applies to the ticket price after discounts have been applied.
// In addition to the constructor and two public methods, write a main method that instantiates a BalletTicket for a senior citizen sitting 
// in the mezzanine section and prints a message to the console of the form "Your {orchestra|mezzanine} ticket costs $X.XX.

public class BalletTicket {
	private String section;
	private int age;

	public BalletTicket(String section, int age) {
		if (section.equals("orchestra") || section.equals("mezzanine")) {
			this.section = section;
		} else {
			this.section = "orchestra";
			System.out.println("Since you failed to provide one of the two "
				+ "valid sections (orchestra or mezzanine), you have been "
				+"given an orchestra ticket.");
		}

		this.age = age;
	}

	public String getSection() {
		return section;
	}

	public double getPrice() {
		double price = 0.0;
		price = price + (section.equals("orchestra") ? 50.00 : 40.00);
		price = (age >= 65) ? price - (price * 0.1) : price;
		price = price + (0.05 * price);

		return price;
	}

	public static void main(String[] args) {
		BalletTicket bt1 = new BalletTicket("mezzanine", 80);
		System.out.printf("Your " + bt1.getSection() + " ticket costs $" + "%.2f.", bt1.getPrice());
	}
}