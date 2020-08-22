package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersNestedIf {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		double a = scan.nextDouble();
		
		System.out.println("Please enter the secound number:");
		double b = scan.nextDouble();
		
		System.out.println("Please enter the third number:");
		double c = scan.nextDouble();
		
		double largest;
		
		if (a>b) {
			//here a is already largest than b
			if (a > c) {
				largest = a;
				//a is the largest
			}
			else {
				largest = c;
				//a is largest than b, but c is larger than a
			}
		}else {
				//here b is already larger than a
				if (b >c) {
				//b is the largest
					largest = b;
			}
				else {
					//b is larger than a. but c is larger than b
					largest =c;
				}
			
		}
		System.out.println("Largest number is "+largest);

	}

}
