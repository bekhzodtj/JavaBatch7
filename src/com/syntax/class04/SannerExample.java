package com.syntax.class04;

import java.util.Scanner;

public class SannerExample {

	public static void main(String[] args) {
		//Capture th name from the user and print 
		//Your name is ____
		//Ask the number to  enter the age and print
		//Your name is ____ and age is ____
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your full name!");
		String name = input.nextLine();
		System.out.println("Your name is "+name);
		
		System.out.println("Please enter your age as double!");
		double albanianAge = input.nextDouble();
		System.out.println("Your name is "+ name + " and age is "+albanianAge);

	}

}
