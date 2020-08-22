package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int  time = 10;
		
		System.out.println("____________While Loop________________");
		//This code will execute infinitely
		// But then we fixed it by adding time++
		while (time < 12) {
			System.out.println("Good Morning!");
			time++;
		}
		//This block of code will not execute
		while (time > 12) {
			System.out.println("Good Morning!");
			time--;
		}
		System.out.println("________________________________");
		
		int x = 1;
		while (x <= 50) {
		System.out.println(x);
		x++;
		}
		System.out.println("___________________________________");
		
		int y = 20;
		while (y <= 30) {
			System.out.println(y);
			y++;
		}
		System.out.println("____________________________________");
		System.out.println("How to print from 5 to 15 at the some line?");
		
		int z = 5 ;
		while (z <= 15) {
			System.out.print(z +" ");
		z++;
		}
		System.out.println();
		System.out.println("_________________________________");
		System.out.println("How to print from 10 to 1 at the some line?");
		int k = 10;
		while (k >= 1) {
			System.out.println(k);
			k--;
		}
	}

}
