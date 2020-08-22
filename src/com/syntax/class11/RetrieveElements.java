package com.syntax.class11;

public class RetrieveElements {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };
		// getting all elements
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ",");
		}
		System.out.println();

		System.out.println("---Print using advanced loop---");
		for (char element : grades) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("______________________________________________________");
		
		String[] fruits = { "Apple", "Orange", "Grapes", "Banana", "Cucumber" };
		for (int k = 0; k < fruits.length; k++) {
			if (fruits[k].equals("Grapes")) {
				System.out.println(fruits[k] + " is my favorite fruit");
			} else {
				System.out.println(fruits[k]);
			}
		System.out.println();

		System.out.println("-------------2nd way---------");
		for (String f : fruits) {
			System.out.print(f + " ");
		}
		System.out.println();
	}
	}
}
