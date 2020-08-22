package com.syntax.class12;

public class Recap2DArray {

	public static void main(String[] args) {
		String[][] animals = {
				{"Cat","Dog","Bird","Hamster"},
				{"Tiger","Children","Bear"}
		};
		int howManyArrays = animals.length;
		System.out.println(howManyArrays);
		
		int element1Array = animals[1].length;
		System.out.println(element1Array);
		
		for (int r = 0; r < animals.length;r++) {
			for (int c = 0; c < animals[r].length; c++) {
				String animal= animals[r][c];
				System.out.print(animal+ " ");
			}
		System.out.println();
		}
		
		System.out.println("----------------------USING ENHANCED FOR LOOP----------------");
		for (String[]array: animals) {
			for (String animal:array) {
				System.out.print(animal+ " ");
			}
			System.out.println();
		}
	}

}
