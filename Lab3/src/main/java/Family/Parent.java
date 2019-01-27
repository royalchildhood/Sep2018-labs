package Family;

public class Parent extends GrandParent{

	public final String lastName = "Alex";
	private int bankAccount = 11223344;
	private int bankAccountBalance = 1000000;

	public Parent(String firstName) {
		super(firstName);
	}

	public final void getName() {
		System.out.println(firstName + lastName);
	}

	protected void educationDirection() {
		System.out.println("Working on Medical field");
	}

	private void manageBankAccount(int input) {
		bankAccountBalance += input;
	}
}
