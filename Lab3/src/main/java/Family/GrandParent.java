package Family;

public class GrandParent {

	public final String firstName;
	public final String lastName = "Alexendra";

	public GrandParent(String firstName) {
		this.firstName = firstName;
	}

	protected void singOldSongs() {
		System.out.println("Country road");
	}
}
