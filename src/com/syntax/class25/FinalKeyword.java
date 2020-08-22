package com.syntax.class25;

public class FinalKeyword {
	
	public static String str = "Hello";
	
	public static final String username="Admin";
	
	

	public static void main(String[] args) {
		System.out.println(str);
		str="Hi";
		System.out.println(str);

		System.out.println(username);
	}

}
