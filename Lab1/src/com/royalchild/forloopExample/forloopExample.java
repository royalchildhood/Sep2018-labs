package com.royalchild.forloopExample;

public class forloopExample {

	public static void main(String[] args) {

		/**
		 * Print all numbers that can be divided by 9 within 999
		 */

		System.out.print("number can be divided by 9:");
		for (int number = 1; number <= 999; number++) {
			if (number % 9 == 0) {
				System.out.print(number + "   ");
			}
		}
		System.out.println("");


		/**
		 * keep minus by 123, find how many iteration it takes to get 999 to below 0
		 */
		int counter = 0;
		int valueToCheck = 999;

		while (valueToCheck >= 0) {
			valueToCheck -= 123;
			counter = counter + 1;
		}
		System.out.println("It takes " + counter + " steps to get 999 to 0");


		/**
		 * keep get random numbers from 1 to 100, if the random number is unlucky 13, stop, print how many takes
		 *
		 * hint: keep running this function, see how steps vary
		 */
		int luckyCounter = 0;

		while (true) {
			int random = (int )(Math.random() * 100 + 1);
			if (random == 13) {
				break;
			}
			luckyCounter++;
		}
		System.out.println("It takes " + luckyCounter + " steps to get unlucky 13");
	}

}
