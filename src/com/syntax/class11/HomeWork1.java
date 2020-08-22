package com.syntax.class11;

public class HomeWork1 {
	public static void main(String[] args) {
		//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		int [][] num1 = {
				{ 3, 4, 5, 6 },
				{ 7, 8, 9, 10 },
				{ 11, 12, 13, 14 }
		};
		for (int i = 0; i < num1.length;i++){
			for (int j = 0; j < num1[i].length;j++) {
				if((num1 [i][j] % 2 ) == 0) {
					System.out.print(num1 [i][j]+ ", ");
				}}}
		System.out.println();
		System.out.println("-------------------------2nd Task---------------");
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		//Print the sum of all numbers.
		int [][] num2 = {
				{23, 10, 15},
				{5, 36, 22},
				{1, 17, 8}
		};
		int sum = 0;
		for (int k = 0; k < num2.length;k++) {
			for (int a = 0; a < num2.length;a++){
				sum += num2 [k][a];
			}}
		System.out.println("Sum of the all numbers " +sum);
	}
}
