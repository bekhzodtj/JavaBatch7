package com.syntax.class07;

public class HomeWork3 {

	public static void main(String[] args) {
		// 1.Print odd numbers between 20 and 50 (2 ways)

		int num1 = 50;
		while (--num1 >= 20) {
			System.out.print(num1 + " ");

			num1--;
		}
		System.out.println(" ");
		System.out.println("-------------2nd way---------");

		int num2 = 50;
		while (num2 >= 20) {
			if (num2 % 2 == 1) {
				System.out.print(num2 + " ");
			}
			num2--;
		}
		System.out.println(" ");
		System.out.println("---------------3rd way--------------");
		
		for (int num3 = 50; num3 >= 20; num3--) {
			if (num3 % 2 == 1) {
				System.out.print(num3+" ");
			}
		}
	}

}