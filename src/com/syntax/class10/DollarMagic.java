package com.syntax.class10;

public class DollarMagic {

	public static void main(String[] args) {
		// $$$$
		// $ $
		// $ $
		// $ $
		// $$$$
		for (int r = 1; r <= 5; r++) { // The outer loop controls the rows
			for (int c = 1; c <= 4; c++) { // The inner loop controls the columns
				if (r == 1 || r == 5) { // in the first or last row print everything
					System.out.print("$");
				} else { // in the other rows
					if (c == 1 || c == 4) {// in the first or last column print$
						System.out.print("$");
					} else { // in the other columns print " "
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		//HW re - do this task without using nested if
		//Hint: You should Use logical && +||

	}

}
