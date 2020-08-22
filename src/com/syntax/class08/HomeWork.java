package com.syntax.class08;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.
		/*
		 * System.out.
		 * println("This program takes 2 intiger numbers from user \nand from that range prints the sum of the even and odd integers "
		 * ); Scanner scan = new Scanner(System.in); int sumA = 0; int sumB = 0;
		 * System.out.println("Please enter 2 intiger numbers:"); int a =
		 * scan.nextInt(); int b = scan.nextInt();
		 * 
		 * for (int i = a; i <= b; i += 2) { sumA = sumA + i; } for (int j = a + 1; j <=
		 * b; j += 2) { sumB = sumB + j; }
		 * 
		 * if (a % 2 ==0) { System.out.println("Sum of even numbers = " + sumA +
		 * "\nSum of odd umbers = " + sumB); } else {
		 * System.out.println("Sum of even numbers = " + sumB +
		 * "\nSum of odd numbers = " + sumA); }
		 */
		Scanner scan = new Scanner(System.in);

		int start; // I don't need to initialize because I will read from input

		int end;

		int sumOdd = 0;

		int sumEven = 0;

		int total = 0;

		System.out.println("Please enter a starting number:");

		start = scan.nextInt();

		System.out.println("Please enter a ending number:");

		end = scan.nextInt();

		for (int i = start; i <= end; i++) {

			if (i % 2 == 0) { // even number

				sumEven += i;

			} else { // odd number

				sumOdd += i;

			}

			// 1st way

			// total += i;

		}

		System.out.println("The sum of even numbers is " + sumEven);

		System.out.println("The sum of odd numbers is " + sumOdd);

		// 2nd way

		total = sumEven + sumOdd;

		System.out.println("The sum of all numbers is " + total);

	}

}
