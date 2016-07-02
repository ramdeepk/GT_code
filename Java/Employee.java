public class Employee {
	private double wage;
	private String name;
	// public Employee(double wage, String name) {
	// 	this.wage = wage;
	// 	this.name = name;
	// }

	public String toString() {
		return this.name + " makes $" + this.wage;
	}
}