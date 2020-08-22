package com.syntax.class07;

public class HomeWork2 {

	public static void main(String[] args) {
		//1.Print numbers from 100 to 1
		
		
		int num1 = 100;
		while (num1 >= 1) {
			System.out.println(num1);
			num1--;
		}
		System.out.println("-----------2nd way----------");
		
		int num2 = 100; 
		do {
			System.out.println(num2);
			num2--;
		}while (num2 >= 1);
		
		System.out.println("-------------3rd way----------");
		for (int num3 = 100; num3 >= 1; num3--) {
			System.out.println(num3);
		}
		
			
	}
		

}
