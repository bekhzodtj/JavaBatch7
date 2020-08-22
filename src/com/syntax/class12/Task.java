package com.syntax.class12;

public class Task {

	public static void main(String[] args) {
		String [][] foods = {
				{"Rogan","Tikka","Biryani"},
				{"Plow","Mantu","Sambusa"},
				{"Arancini","Risotto","Carpaccio"}
		};
		for  (int i = 0; i < foods.length;i++) {
			for (int j = 0; j < foods[i].length; j++) {
				String food= foods[i][j];
				System.out.print(food+ ", ");
			}
		System.out.println();
		}
		System.out.println("---------------2nd way-----------------");
		for (String[]array: foods) {
			for (String food:array) {
				System.out.print(food+ ", ");
			}
			System.out.println();
		}

	}

}
