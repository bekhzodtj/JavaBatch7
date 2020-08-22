package com.syntax.class14;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		String word = "";
		String reverse = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter string to reverse");
		word = scan.nextLine();
		int l = word.length();
		for (int i = l - 1; i >= 0; i--)
			reverse = reverse + word.charAt(i);
		System.out.println("Reverse of the entered string: " + reverse);

	}

}
