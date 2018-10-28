package labexample;

public class ExpressCalculator {

	/**
	 * this method is a static method, which means it can be access with class level
	 */
	public static void add(int adder1, int adder2) {
		System.out.println( adder1 + adder2);
	}

	public static void sub(int sub1, int sub2) {
		System.out.println( sub1 -  sub2);
	}

	public static void times(int timer1, int timer2) {
		System.out.println( timer1 * timer2);
	}

	public static void div(int div1, int div2) {
		if (div2 == 0) {
			System.out.print("valid maths rule");
			return;
		}

		System.out.println( div1 / div2);
	}
}
