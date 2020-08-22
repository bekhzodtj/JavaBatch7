package com.syntax.class07;

public class HomeWork1 {
	public static void main(String[] args) {
		//1.Print numbers from 1 to 100 in 1 line with space
		
		int i = 1;
		while (i <= 100) {
			System.out.print(i+ " ");
			i++;
		}
		System.out.println(" ");
		System.out.println("-------2nd way-------");
		
		int x = 1;
		do {
			System.out.print(x+ " ");
			x++;
		}	while (x <= 100);
		System.out.println(" ");
		System.out.println("-------3nd way-------");
		
		for (int num3 = 1; num3 <=100; num3++) {
			System.out.print(num3 + " ");
		}
		
	
	
	
	
	}
}
