package Exe4_arraylist;

import homework.Student;

import java.util.ArrayList;

public class PracticeArrayLIst {

	public static void main(String[] args) {
		Student[] students = new Student[4];
		students[0] = new Student(89, "Tom");
		students[1] = new Student(95, "Tony");
		students[2]= new Student(67, "Mike");
		students[3] = new Student(45, "Tim");

		Student jim = new Student(88, "Tim");
		Student kate = new Student(90, "Kate");

		ArrayList<Student> studentList = new ArrayList<Student>();

		addAllStudent(students, studentList);
	}

	public static void addAllStudent(Student[] students, ArrayList<Student> studentList) {

	}

	public static void addExtraStudent(Student target) {

	}

	public static void removeStudent(ArrayList<Student> studentList, Student target) {

	}

}
