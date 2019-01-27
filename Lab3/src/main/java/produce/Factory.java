package produce;

public class Factory {

	public static Car makeCar(String mode,  String branch) {
		if(mode.equals("BMW")) {
			if (branch.equals("X5")) {
				return new X5();
			} else if (branch.equals("Z4")) {
				return new Z4();
			} else {
				return null;
			}

		} else if (mode.equals("BENZ")) {
			if (branch.equals("GLC")) {
				return new GLC();
			} else if (branch.equals("GT")) {
				return new GT();
			} else {
				return null;
			}

		} else {
			return new Car("default", "default");
		}
	}
}
