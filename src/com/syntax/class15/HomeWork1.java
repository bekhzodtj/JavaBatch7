package com.syntax.class15;

public class HomeWork1 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?
		
		String str = new String("How would you reverse a String");
		String [] words = str.split(" ");
		String reversedString="";
		for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
        	   reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
	   }
		

	}


