public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private String name;
	public HourlyEmployee(double wage, String name) {
		super(wage, name);
	}

	public static void main(String... args) {
		HourlyEmployee a = new HourlyEmployee(9.09, "Jerome Rijkaard");
		System.out.println(a);
	}
}