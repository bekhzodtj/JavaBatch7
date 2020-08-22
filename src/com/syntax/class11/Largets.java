package com.syntax.class11;

public class Largets {

	public static void main(String[] args) {
		//Find the largest number in array
		int[]number = {23, 56, 73, 16, 80, 100, 39};
		
		int largest = 0;
		for (int num : number) {
			
			if (num > largest) {
				largest = num;
			}
		}
		System.out.println(largest);
		

	}

}
