package com.syntax.class05;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// Write a program for user to enter his/hers birth month. Based on the month
		// define the season.
		// Example: if user is born in June, July or August → season ="Summer".
		// At the end of the program we should see output as "You were born ______".

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Please enter your birth month!");
		 * 
		 * String month = scan.nextLine();
		 * 
		 * if (month.equals ("March")|| month.equals ("April")||month.equals ("May")) {
		 * System.out.println("You were born Spring"); } else if (month.equals
		 * ("June")|| month.equals ("July")|| month.equals ("August")){
		 * System.out.println("You were born Summer"); } else if (month.equals
		 * ("September")|| month.equals ("Novenber")|| month.equals ("October")) {
		 * System.out.println("You were born Fall"); } else if (month.equals
		 * ("December")|| month.equals ("January")|| month.equals ("February")) {
		 * System.out.println("You were born Winter"); } else {
		 * System.out.println("Invalid entry please try again!"); }
		 */
		
		
		System.out.println("*************************************************");
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your birth month:");
		
		String month = scan.next();
		String season = null;
		
		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		}
		else {
			season = "Unknow";
		}
	
		System.out.println("You were born in "+season);
		

	}

}
