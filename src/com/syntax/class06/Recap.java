package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		// if hour id between 1-11 -->Morning
		// if hour id between 12-15 -->Afternoon
		// if hour id between 16-20 -->Evening
		// if hour id between 21-24 -->Night
		// We will Print: Right now it is ____________

		/*
		 * int hour = 24;
		 * 
		 * if (hour >= 1 && hour <= 11) {
		 *  System.out.println("Right now it is Morning");
		 * } 
		 * else if (hour >= 12 && hour <= 15) {
		 * System.out.println("Right now it is Aternoon"); 
		 * }
		 * else if (hour >= 16 && hour <= 20) { 
		 * System.out.println("Right now it is Evening"); 
		 * } 
		 * else if (hour >= 21 && hour <= 24) { 
		 * System.out.println("Right now it is Night"); 
		 * }
		 * else {
		 * System.out.println("Unknown"); 
		 * }
		 */
		

		System.out.println("************************************************");
		
		
		int hour = 26;
		String dayTime;

		if (hour >= 1 && hour <= 11) {
			dayTime = "Morning";
		} else if (hour >= 12 && hour <= 15) {
			dayTime = "Afternoon";
		} else if (hour >= 16 && hour <= 20) {
			dayTime = "Evening";
		} else if (hour >= 21 && hour <= 24) {
			dayTime = "Night";
		} else {
			dayTime = "Unknown";
		}
		//if it is unknown i don't want to print anything
		if (!dayTime.equals("Unknown")) {
		System.out.println("Right now it is "+dayTime);
		}

	}

}
