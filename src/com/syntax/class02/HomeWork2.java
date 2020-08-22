package com.syntax.class02;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values.
		 * Your program should say.
		 * "The _______ of 2 numbers ___ and ___ is equal to _____" 
		 */
		double num1 = 25.3;
		double num2 = 10.5;
		double dSum = num1 + num2;
		
		double dSub = num1 - num2;
		
		double dMult = num1 * num2;
		
		double dDiv = num1 / num2;
		
		
		System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + dSum);
		System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + dSub);
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + dMult);
		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + dDiv);
	

		/*
		 * Write a program to find the square of the number 3.9. You program should say "The square of the ____ is ____ "
		 */
		System.out.println("****************");
		
		double d1  = 3.9;
		double dSq = d1 * d1;
		
		System.out.println("The square of the " + d1 + " is " +dSq);
		
		/*Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say. 
		 * "The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"
		 */
		System.out.println("*************");
		
		int iWidth = 5;
		int iHeight = 8;
		int iPer = 2 * (iWidth+iHeight);
		int iArea = iWidth * iHeight;
		
		
		System.out.println("The perimeter of a rectangle with width" +iWidth+ " and height " +iHeight+ " is equal to " +iPer+ " and the area is "+iArea);
		
		
		
		
	}

}
