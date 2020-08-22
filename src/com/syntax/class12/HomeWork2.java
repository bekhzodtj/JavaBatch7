package com.syntax.class12;

public class HomeWork2 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		
		int n = 10, t1 = 0, t2 = 1;
		System.out.print("First " + n + " Fibonacci series: ");

		for (int i = 1; i <= n; ++i) {
			System.out.print(t1 + "  ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		int a,b,c;
		a = 1;
		b = 1;
		System.out.println();
		for (int k = 1; k <= 10;k++) {
			System.out.print(a+ " ");
			c = a + b;
			a = b;
			b = c;
			
		}
	}
}
