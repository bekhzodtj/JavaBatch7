package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner (System.in);
		
	
		//System.out.println("Please write a long text");
		//String text1 = myScanner.nextLine();
		//System.out.println(text1);
		
		//System.out.println("Please write a long text");
		//String text2 = myScanner.next();
		//System.out.println(text2);
		
		//System.out.println("Please write a long text");
		//String text3 = myScanner.next();
		//System.out.println(text3);

		System.out.println("___________________________________________");
		
		System.out.println("Please enter Behzod,s age (int)!");
		int num = myScanner.nextInt();
		System.out.println(num);
		
		System.out.println("Please enter behzod,s age (double)!");
		double d = myScanner.nextDouble();
		System.out.println(d);
		
		System.out.println("Please enter if behzod is happy (true/false)!");
		boolean b = myScanner.nextBoolean();
		System.out.println(b);
		
		System.out.println("Please enter behzod name!");
		char mychar = myScanner.next().charAt(0);
		
	}

}
