package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		//we wont to ask users name 5 time and print Good Afternoon____5 times
		Scanner scan = new Scanner(System.in);
		
		int num = 1;
		
		while (num <= 5) {
		System.out.println("Please enter your name:");
		String name = scan.nextLine();
		
		System.out.println("Good Afternoon "+name);
		}

	}

}
