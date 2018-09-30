package com.royalchild.lab.example;

public class MathExample {

	public static void main(String[] args) {

		// simulate the math function y = ( x * z ) + (x / z)

		int y = times(4, 2) + divide(4, 2);

		System.out.print(y);
	}

	public static int times(int x, int z) {
		return x * z;
	}


	public static int divide(int x, int z) {
		return x/z;
	}
}
