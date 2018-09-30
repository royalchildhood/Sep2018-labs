package com.royalchild.lab.example;

public class NestedMethodExample {




	public static void functionA() {
		System.out.println("This is function A, I start the call");
		functionB_calledbyA();
	}

	public static void functionB_calledbyA() {
		System.out.println("This is function B, it is called by function A");
		functionC_calledbyB();
	}


	public static void functionC_calledbyB() {
		System.out.println("This is function C, it is called by function B");
		functionD_calledbyC();
	}

	public static void functionD_calledbyC() {
		System.out.println("This is function D, it is called by C");
	}


	public static void main(String[] args) {

		// Java method can call each other
		functionA();
	}
}
