package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		int x =1;
		while (x <= 5) {//checks before going into the loop
			System.out.println("Hello");
			x++;
		}
		System.out.println("--------Using a Do While loop--------");
		int y = 1;
		do {
			System.out.println("Hello");
			y++;
		}while (y <=3);//checks after going the loop
		

	}

}
