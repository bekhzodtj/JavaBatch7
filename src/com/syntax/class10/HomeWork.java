package com.syntax.class10;

public class HomeWork {

	public static void main(String[] args) {
		for (int r = 5; r >= 1; r--) {

			for (int c = 1; c <= r; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("********************************");
		for (int r = 5; r > 0; r--) {

			for (int c = r; c >= 1; c--) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("********************************");
		for (int row = 1; row <= 4; row++) {
			for (int col = row; col >= 1; col--) {
				System.out.print(col);
			}
			System.out.println();
		}

		for (int r = 5; r > 0; r--) {

			for (int c = r; c >= 1; c--) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
