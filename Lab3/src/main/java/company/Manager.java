package company;

import java.util.ArrayList;

public class Manager extends Employee {

	int managerID;

	protected ArrayList<Integer> ids_worker = new ArrayList<Integer>();

	public Manager (int Salary, String name, int yearsOfService, int id) {
		super(Salary, name, yearsOfService);
		this.managerID = id;
	}

	protected void addaTeamMember(int id) {
		ids_worker.add(id);
	}

	protected void fireaTeamMember(int id) {
		ids_worker.remove(id);
	}
}
