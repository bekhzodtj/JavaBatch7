package com.syntax.class15;

public class HomeWork {

	public static void main(String[] args) {
		// How would you reverse a String character by character?
	    
		String str = "Today is raining";
	    
	    StringBuilder stringBuilder = new StringBuilder(str);
	    
	    stringBuilder = stringBuilder.reverse();
	    
	    System.out.print("The reversed string of the '"+str+"' is: ");
	    System.out.println(stringBuilder);
	  }
	}

	
