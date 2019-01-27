package company;


public class Worker extends Employee {
	public int id;

	public Worker (int Salary, String name, int yearsOfService, int id) {
		super(Salary, name, yearsOfService);
		this.id = id;
	}

	protected int getId() {
		return id;
	}
}