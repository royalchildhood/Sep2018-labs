package Family;

public class Child2 extends Parent {

	public String hobby = "Sport";

	public Child2(String firstName) {
		super(firstName);
	}

	@Override
	protected void educationDirection() {
		System.out.println("Working on Computing science");
	}
}