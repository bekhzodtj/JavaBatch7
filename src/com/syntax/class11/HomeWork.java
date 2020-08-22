package com.syntax.class11;

public class HomeWork {

	public static void main(String[] args) {
		// Create a 2D array where you will store the following values:
		// Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama.
		// After storing values print the following:Mrs Smith, Mr Obama, Ms Jackson,
		// Miss Jordan.
		String[][] names = { 
				{ "Mr", "Mrs", "Ms", "Miss" }, 
				{ "Smith", "Jordan", "Jacson", "Obama" } };
		
		System.out.print(names[0][1] + " " + names[1][0] + ", ");
		System.out.print(names[0][0] + " " + names[1][3] + ", ");
		System.out.print(names[0][2] + " " + names[1][2] + ", ");
		System.out.print(names[0][3] + " " + names[1][1] + ". ");

		System.out.println();
		System.out.println("--------------------2nd Task--------------------------");

		// Create a 2D array that first row will contain 4 names and second row will
		// contain grades.
		// Then you program should print name of the students that has A and B grade

		String[][] students = { 
				{ "John", "Ali", "Jack", "Samir" },
				{ "A", "B", "C", "A" } };

		System.out.println(students[0][1] + " has " + students[1][2] + " grade.");
		System.out.println(students[0][0] + " has " + students[1][1] + " grade.");
		System.out.println(students[0][2] + " has " + students[1][0] + " grade.");
		System.out.println(students[0][3] + " has " + students[1][3] + " grade.");
	}

}
