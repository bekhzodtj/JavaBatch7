package com.syntax.class17;

public class Main {
	// Declare 3 instance variables to hold:

	// year, school name and batch #

	// Access variables from the main method and assign specific values to them
	// Print values of your variables in the following format:
	
	public static String student;
	String school;
	int year;
	int batch;
	 
	Main (String school, int year, int batch){
		this.school=school;
		this.year=year;
		this.batch=batch;
	}
		void displayInfo() {
			System.out.println("I am a student of batch "+batch+" studying at " +school+" in the year of " +year);
		}
		public static void main(String[] args) {
			Main obj = new Main("Syntax",2020,6);
			obj.displayInfo();
		}
	}
	


