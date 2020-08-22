package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// HomeWork: Using scanner class create calculator.
		// Allow user to enter 2 numbers and operator(+,-,*,/).
		// Based on operator provide the result to user.
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Please enter your firt number");
		 * 
		 * int num1 = scan.nextInt(); System.out.println("Please enter operator");
		 * 
		 * char operator = scan.next().charAt(0);
		 * System.out.println("Please enter your secound number"); int num2 =
		 * scan.nextInt(); int result;
		 * 
		 * switch (operator) { case '+': result = num1 + num2; System.out.println(num1 +
		 * "+" + num2 + "=" + result); break; case '-': result = num1 + num2;
		 * System.out.println(num1 + "-" + num2 + " = " + result); break; case '*':
		 * result = num1 + num2; System.out.println(num1 + "+" + num2 + "=" + result);
		 * break; case '/': result = num1 + num2; System.out.println(num1 + "/" + num2 +
		 * "=" + result); break; default: System.out.println("Invaled");
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your birth month:");

		String month = scan.next();

		String season = "Unknown";

		if (month.equals("December") || month.equals("January") || month.equals("February")) {

			season = "Winter";

		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {

			season = "Spring";

		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {

			season = "Summer";

		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {

			season = "Fall";

		}

		System.out.println("You were born in " + season);

	}

}
