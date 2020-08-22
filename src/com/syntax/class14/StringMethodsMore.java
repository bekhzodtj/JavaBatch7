package com.syntax.class14;

public class StringMethodsMore {

	public static void main(String[] args) {
		
		System.out.println("------------------.charAt() method-------------------");
		
		String season = "Summer";
		
		char character = season.charAt(4);
		System.out.println(character);
		
		System.out.println("-------------------.indexOf() method---------------");
		
		int index = season.indexOf('m');
		System.out.println(index);
		
		String hello="Hello Ksenia";
		int indexOfKsenia=hello.indexOf("ksenia");
		System.out.println();
				
		
		System.out.println("-----------------.substring() method----------------");
		
		String message = "You guys are awesome";
		String newMessage=message;
		System.out.println(newMessage);
		
		String substring=message.substring(4);//take string starding from index 4
		System.out.println(substring);
		
		String middleWord=message.substring(4, 8);
		System.out.println(middleWord);
		

	}

}
