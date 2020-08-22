package com.syntax.class15;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		// How would you check if String is palindrome or not?
		System.out.println("Enter the string");
		String str = new Scanner(System.in).nextLine();
		String Result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			Result += str.charAt(i);
		}
		if (Result.equals(str))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}
}
