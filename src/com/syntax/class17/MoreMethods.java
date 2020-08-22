package com.syntax.class17;

import java.lang.reflect.Array;

public class MoreMethods {
	public static void main(String[] args) {
		MoreMethods obj = new MoreMethods();
		int[] array = { 199, -56, 46, 23, 90 };
		int large=obj.largestFromArray(array);
		
		System.out.println(large);
		
		String[] words=obj.getWords("Good night friends");
		
		for(String word:words) {
			System.out.println(word);
		}
	}
	// create a method that should return the largest from an array

	int largestFromArray(int[] array) {

		int largest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}
	
	//create a method that will accept a String and return words from that string
	//Hello World, Good Night friends
	
	String[] getWords(String str) {
		return str.split(" ");
	}

}
