package com.syntax.class11;

public class HomeWork3 {

	public static void main(String[] args) {
		// Create an array of countries: north america countries,
		// south america countries, europe countries, asian countries, african
		// countries.
		// Then print all values from that array using 2 different loops and calculate
		// how many total countries been stored.
		
		String[][] countries = {
				{"Mexico","Canada","Cuba","United States"},
				{"Germany","Italy","France","United Kingdom"},
				{"Tajikistan","China","Japan","Russia"},
				{"Ghana","Algeria","Libya","Mali"}		
		};
		int country = countries.length;
		
		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i]+ ", ");
		}
		System.out.println();
		System.out.println("Total of country listed: "+country);
	
		
	}

}
