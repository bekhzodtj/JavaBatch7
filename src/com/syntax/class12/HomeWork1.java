package com.syntax.class12;

public class HomeWork1 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		int num =35;
		boolean prime = false;
		for (int i = 2; i <= num/i; ++i) {
			if (num % i == 0) {
				prime = true;
				break;
			}
		}
		if (!prime)
			System.out.println(num + " is a prime number.");
		else 
			System.out.println(num + " is not a prime number.");

	}

}
