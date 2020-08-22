package com.syntax.class15;

public class Task {

	public static void main(String[] args) {
		// Create a String that will hold a sentence.
		// Write a program to get a new String without any spaces.
		String str = "Today is holiday and outsade is raining I cannot go out";

		String[] array = str.split(" ");
		for (String s : array) {
			System.out.print(s + "");
		}

		System.out.println();
		System.out.println("--------------------------2nd Task---------------");
		// Create a String that should be combination of letters, numbers and special
		// characters.
		// Find out how many alpha characters are there in the String.
		String str1 = "jvjfjjvndfj545665@#$^&";
		str1=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1.length());
		
		System.out.println("-----------------3rd Task-------------");
		
		//You have a String a=“Is it saturday? Is it raining?
		//Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array1 = a.split("[0-9]");

		int sentences = array1.length;

		System.out.println("Total number of sentences is " + sentences);

				

	}

}
