package com.syntax.class14;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// rite a program that reads two people's first
		// names and if they expecting boy or girl?
		// Based on the input suggests a name for a baby:
		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY
		// Example Output:
		/// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? girl
		// Suggested baby name: MAIEL
		Scanner scan = new Scanner (System.in);
		System.out.println("Mom’s first name?");
		String mom = scan.next();
		System.out.println("Dad’s first name?");
		String dad = scan.next();
		System.out.println("Boy or Girl?");
		String gender = scan.next();
		String babyName;
		if (gender.toLowerCase().equals("boy")) {
			System.out.println("Congratulation, it is a boy");
			babyName= dad.substring(0,dad.length()/2) + mom.substring(mom.length()/2);
			
			
		}else if (gender.equalsIgnoreCase("girl")) {
			System.out.println("Congratulation, it is a girl");
			babyName=mom.substring(0,mom.length()/2)+dad.substring(dad.length()/2);
			
		}else {
			babyName="Unknow";
			
		}
		System.out.println(babyName.toUpperCase());
		scan.close();
		
		
	}

}
