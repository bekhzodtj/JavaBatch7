package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean isMorning = true;
		boolean isSchool = false;
		int time = 20; 
		
		if (isMorning) {
		     System.out.println("Good morning");
		     
		     if (isSchool) {
		    	 System.out.println("Friends");
		     }else {
		    	 System.out.println("Family");
		     }
		     System.out.println("Bye");
		}else {
			System.out.println("It is not morning!");
	
			if (time < 18) {
				System.out.println("Good aftrenoon!");
				
			}else {
				System.out.println("good evening!");
			}
		System.out.println("Vika has no quetions");
	
		}
		}
}
