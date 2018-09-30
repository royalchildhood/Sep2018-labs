package com.royalchild.lab.example;

public class MethodAssignToVariableExample {


	public static void main(String[] args) {

		// The parameter inside the method is just a symbol, we only pass value to the method

		int passInValue = 79;

		System.out.print(isPrime(passInValue));
	}


	public static boolean isPrime(int valueToCheck) {

		// Prime number start from 2
		if (valueToCheck < 1) {
			// when return call in here, method stops, it will not execute anything later
			return false;
		}

		boolean isPrime = true;

		// Write your program here
		for (int nextToDivide = 2; nextToDivide < valueToCheck; nextToDivide++) {
			if (valueToCheck % nextToDivide == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}
}
