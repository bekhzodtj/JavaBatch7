package com.syntax.class12;

import java.util.Arrays;

public class HomeWork3 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
		int[] numbers = { 45, 36, 8, 70, 50, 2, 69, 99 };

		// lets try to find the maximum
		// 1st way
		int max = numbers[0];
		int min = numbers[0];
		for (int num : numbers) {
			if (num > max) {
				//I found a bigger number
				max = num;
			} else if (num < min) {
				//I found a smaller number
				min = num;
			}
		}
		System.out.println("Maximum is: " + max);
		System.out.println("Minimum is: " + min);
		
		//2nd way
		Arrays.sort(numbers);
		for (int num:numbers)
		System.out.println("Maximum is: " + numbers[numbers.length -1]);//the last element 
		System.out.println("secound largest: " + numbers[numbers.length -2]);
		System.out.println("Minimum is: " + numbers[0]);

	}
}