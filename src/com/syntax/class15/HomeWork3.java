package com.syntax.class15;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		//How would you swap  2 strings without a temporary variable?
		
		String s = "Hello";
		String j = "World";
	    System.out.println("String a ="+s); 
	    System.out.println("String b ="+j);
	    
	    s = s + j;
	    j = s.substring(0,s.length()-j.length());
	    s = s.substring(j.length());
	    System.out.println("After Swap");
	    System.out.println("String a ="+s);
	    System.out.println("String b ="+j);

		

		

	}

}
