package com.syntax.class03;

public class HomeWork {

	public static void main(String[] args) {
		// Create a Java program and declare int variable that will hold a month.
		// Based on the value of the variable your program should print the name of the
		// month.
		int month = 12;

		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid Month");
		}
		System.out.println("*****************************************");
		// Write a Java Program to check whether number is Even or Odd.

		int num = 7;

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

		// 2nd way both way are acceptable
		if (num > 0) {

			System.out.println("Number is positive!");

		} else if (num == 0) {

			System.out.println("Number is zero!");

		} else {

			System.out.println("Number is negative!");

		}

		// task-3: Check whether the number is odd or even

		int num3 = 123;

		int remainder = num3 % 2;

		if (remainder == 0) {

			System.out.println(num3 + " is even!");

		} else {

			System.out.println(num3 + " is odd!");

		}

	}

}
