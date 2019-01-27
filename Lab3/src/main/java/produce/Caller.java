package produce;

import Family.Parent;

public class Caller {
	public static void main(String[] args) {
		Car myNewCar = Factory.makeCar("BENZ", "GT");
		System.out.println(myNewCar);
	}
}
