package com.syntax.class11;

public class Recap {
	public static void main(String[] args) {
		int []grades = new int [5];
		grades [4] = 90;
		
		int size = grades.length;
		System.out.println("array size is: " + size);
		
		grades[4] = 90;
		grades[3] = 85;
		grades[2] = 92;
		grades[1] = 75;
		grades[0] = 100;
		
		//What is the average of the class
		//1st silly way
		int avarage =grades[0] + grades[1] + grades[2] + grades[3] + grades[4] / size;
		System.out.println("Class average is: " + avarage);
		
		// 2nd best way
		int total = 0;
		for (int k = 0; k < 5; k++) {
			total += grades[k];
		}
		
		System.out.println("Class avarage is: " + total /5);
		
		
		
		
		System.out.println("________________________________________");
		
		String[] cities = { "Fairfax", "Kiev", "Tampa","Washington","Arlinton",
				"NYC","Lorton","Chicago"};
		System.out.println("I live in " + cities[2]);
		
		int i = 1;
		System.out.println("I live in " + cities[i]);
		
		i += 2;
		System.out.println("I moved to " + cities[i]);
		int cityLength = cities.length;
		System.out.println("Total number of cities is: " + cityLength);
		
		System.out.println("The last city in the list is: " + cities[cityLength -1]);
		
		
		System.out.println("_______________________________________________________");
		//I want to print all the cities
		//cities[0], cities[1],.....cities[7]
		for(int j = 0; j < cityLength;j++) {
			System.out.println(cities[j]);
		}
				
	}

}
