package company;

import java.util.ArrayList;

public class CEO extends Manager {

	private ArrayList<Integer> ids_manager = new ArrayList<Integer>();
	private final int num_stock = 10000;

	public CEO (int Salary, String name, int yearsOfService, int id) {
		super(Salary, name, yearsOfService, id);

	}

	protected void addaManager(int id) {
		ids_manager.add(id);
	}

	protected void fireaManager(int id) {
		ids_manager.remove(id);
	}
}
