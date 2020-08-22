package com.syntax.class16;

public class Task {
	// Create a method that will take 2 parameters as a numbers and prints which
	// number is larger.
	void findLargerNum(int a, int b) {
		if (a > b)
			System.out.println("Fist is larger");
		else if (b > a)
			System.out.println("Second is larger");
		else
			System.out.println("Both are equal");

		// Create a method that will take a number and prints whether the number is even
		// or odd.
	}

	void evenOdd(int x) {
		if (x % 2 == 0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}

	//Create a method that will print whether given String is palindrome or not.
	
	void palindrome(String word) {
		String b = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			b += word.charAt(i);
		}

		if (b.equals(word)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " isn't palindrome");
		}
	}
	/*
	 * Create a method that will say Hello in different language based on the
	 * country that will passed when method is executed.
	 */
	void sayHello(String country) {

		country = country.toLowerCase();

		switch (country) {

		case "usa":
			System.out.println("Hello");
			break;

		case "turkey":
			System.out.println("Merhaba");
			break;

		case "egypt":
			System.out.println("Ehlen wa Sahlen");
			break;

		default:
			System.out.println("Hi");
		}
	}

	
	}
