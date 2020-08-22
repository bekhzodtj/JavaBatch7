package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		//Let's have a date of month and a day if week
		//if it is Friday-->  We are going to watch a movie 
		//                   if date is 13 --> Watch a scary movie
		//                   if date is not 13 -->Watch a comedy
		// if it is not Friday -->We are going to study Java
		
		boolean isFriday = false;
		int date = 25;
		if (isFriday) {
			System.out.println("It it is Friday. I am going to watch a movie!");
		}else {
			System.out.println("It it is NOT Friday. I am going to study JAVA!");
		}
		
		if (date ==13) {
			System.out.println("I will watch a SCARY movie!");
			
		}else {
			System.out.println("I will watch a COMEDY!");
		}
		

	}

}
