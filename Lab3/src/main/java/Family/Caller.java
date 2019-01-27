package Family;

public class Caller {
	public static void main(String[] args) {
		Parent c2 = new Child2("Jimmy");
		System.out.println( ((Child2)c2).hobby);
	}
}
