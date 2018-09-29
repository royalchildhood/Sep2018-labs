package com.royalchild.assignment.answers;

public class IsPrimeNumber {

	/**
	 *
	 * Prime Number
	 *
	 * A prime number is a number than can be only divided by 1 and itself, nothing else,
	 * find out if a positive input number is a prime number.
	 *
	 * e.g. 13 is a prime number it can be only divided by 1 and 13
	 *
	 * hint: use for loop to check from 1 to the number, increase the value to see if it can be divided
	 *
	 * Bonus: is there any smart ways to improve the algorithm??
	 *
	 *
	 * expected: input 121 should print false, as it can be divided by 11
	 *           input 137 should print true
	 *
	 */
	public static void main(String[] args) {
		// the testing value should be between 1 to 12
		int numberToCheck = 15;
		boolean isPrime = true;

		// Write your program here
		for (int valueToCheck = 2; valueToCheck < numberToCheck; valueToCheck++) {
			if (numberToCheck % valueToCheck == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.print(isPrime);
	}
}
