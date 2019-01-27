package company;

public class Employee {
	private int Salary;
	public final String name;
	public int yearsOfService;

	public Employee (int Salary, String name, int yearsOfService) {
		this.Salary = Salary;
		this.name = name;
		this.yearsOfService = yearsOfService;
	}

	public void getARaise(int income) {
		this.Salary += income;
	}
}