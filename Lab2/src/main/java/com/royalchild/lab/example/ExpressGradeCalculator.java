package com.royalchild.lab.example;

import labexe3.Student;

public class ExpressGradeCalculator {

	public static void getFinalGrade(Student input) {
		double myTotalGrade = input.finalgrade * 0.4 + input.midtermgrade* 0.2 + input.everydaygrade * 0.4;

		if (myTotalGrade >= 85) {
			System.out.println("A");
		} else if (myTotalGrade < 85 && myTotalGrade >= 75) {
			System.out.println("B");
		} else if (myTotalGrade < 75 && myTotalGrade >= 60) {
			System.out.println("c");
		} else if (myTotalGrade < 60 && myTotalGrade >= 50) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

	public static void prettyPrint(Student input) {
		System.out.println(
				"Student info: first name - : " + input.firstname
				+ " last name - : " + input.lastname
				+ " final grade - :" + input.finalgrade
				+ " mid grade - :" + input.midtermgrade
				+ " everyday grade - " + input.everydaygrade
				+ " year of school" + input.schoolyear
		);
		getFinalGrade(input);
	}
}
