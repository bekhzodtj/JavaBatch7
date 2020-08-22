package com.syntax.class03;

public class BooleanIfCondition {

	public static void main(String[] args) {

		boolean flag = true;
		if (flag) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}
		System.out.println(flag);// If you want to check if flag == false// ! (exclamation mark will (reverse the
									// condition)/(the opposite of the condition)// if (!flag) {//
									// System.out.println("Hi");// } else {// System.out.println("Bye");

		System.out.println("*******************************");
		int day = 7;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid Day");
		}

	}

}
