package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		// Declare a number a compare if the number is larger than 100
		// if it is larger than 100, i will print --> my number is large

		int num = 178;

		boolean result = num > 100;

		System.out.println("Let us check");

		if (num > 100) {
			System.out.println("My number is large");
		} else {
			System.out.println("My number is small");
		}

		System.out.println("The check is complete");
		
		System.out.println("_____________________");
		int expectedHour = 15;
		int actualHour = 20;
		
		if (actualHour >= expectedHour) {
			System.out.println("You will love Java");
		}else { 
			System.out.println("You will Not love Java");
		}
		System.out.println("______________________");
		double budget = 10000;
		double carPrice = 15000;
		
		if (budget > carPrice) {//I will buy only if i have more money
			System.out.println("I will buy this car");
			System.out.println("I am happy");
		}else {//otherwise
			System.out.println("I will not buy this car");
			System.out.println("I will study Java");
			
		}

	}
}
