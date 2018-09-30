package com.royalchild.lab.example;

public class MethodOrderExample {

	public static void myFunction4() {
		System.out.println("This is function 4");
	}

	public static void myFunction1() {
		System.out.println("This is function 1");
	}

	public static void myFunction2() {
		System.out.println("This is function 2");
	}

	public static void myFunction3() {
		System.out.println("This is function 3");
	}


	public static void main(String[] args) {

		// Java method order does not matter
		// only the methods get called in main get executed
		myFunction1();
		myFunction4();
	}
}
