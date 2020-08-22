package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// We are counting from 1 to 10
		// we want to stop the loop when reach

		System.out.println("-----Break------");
		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				// System.out.println("I am stopping the loop");
				break;
			}

			System.out.println(i);
		}
		System.out.println("We are outside of the loop");

		System.out.println("--------continue-------");
		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				System.out.println("I am stopping the loop");
				continue;
			}

			System.out.println(i);
		}
		System.out.println("We are outside of the loop");

	}

}
