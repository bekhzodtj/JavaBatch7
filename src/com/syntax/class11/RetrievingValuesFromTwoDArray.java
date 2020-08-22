package com.syntax.class11;

public class RetrievingValuesFromTwoDArray {

	public static void main(String[] args) {
		// Put the months for each season in one row
		String[][] months = { 
				{ "December", "January", "February" }, 
				{ "March", "April", "May" },
				{ "June", "July", "August" }, 
				{ "September", "October", "November" } };

		int rows = months.length; // how many array are inside, how many rows?
		System.out.println(rows + "Seasons");

		int winterLength = months[0].length;// how many elements/columns are in row with index 0?
		System.out.println(winterLength + " Months in row with index 0 ");

		int lastRowsSize = months[rows - 1].length;

		// Nested loops are married (joke) to 2D array
		for (int i = 0; i < months.length; i++) {// iterating over rows

			for (int col = 0; col < months[i].length; col++) {// iterating over columns
				System.out.print(months[i][col] + " ");

			}
			System.out.println();
		}

	}

}
