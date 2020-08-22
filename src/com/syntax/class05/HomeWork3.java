package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// Write a program that will read three inputs of scores
		// (quiz, mid term, and final scores) and determine the
		// grade based on the following rules:
		// if the average score >=90 → grade=A
		// if the average score >= 70 and <90 → grade=B
		// if the average score>=50 and <70 → grade=C
		// if the average score<50 → grade=F
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your quiz score!");
		int quiz =scan.nextInt();
		System.out.println("Please enter your mid term score!");
		int midTerm = scan.nextInt();
		System.out.println("Please enter your final score!");
		int Final = scan.nextInt();
		int totalScore = (quiz + midTerm + Final)/3;
		
		if ( totalScore > 90) {
			System.out.println("You are grade = A ");
		}
		else if (totalScore >= 70 && totalScore < 90) {
			System.out.println("You are grade = B");
		}
		else if (totalScore >= 50 && totalScore < 70) {
			System.out.println("You are grade = C");
		}
		else if (totalScore<= 50) {
			System.out.println("You are grade = F");
		}
		else  {
			System.out.println("Invalid entry please try again!");
		}
	
	
	}
}
