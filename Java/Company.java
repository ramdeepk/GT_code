public class Company<T extends Emp> {
	public Company() {
		System.out.println("Company.");
	}
	public static void main(String[] args) {
		Company<HourlyEmp> h = new Company<>();
		Company<SalaryEmp> g = new Company<>();
		Company<SummerInt> b = new Company<>();
	}
}