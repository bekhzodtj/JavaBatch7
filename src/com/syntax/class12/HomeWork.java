package com.syntax.class12;

public class HomeWork {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		int a = 20;
		int b = 30;
		System.out.println("Before swap:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
