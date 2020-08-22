package com.syntax.class20;

public class USA {
	// define 2 variables for state and capital and have a constructor to initialize
	// it.

	public static String country;
	String state;
	String capital;

	USA(String state, String capital) {
		this.state = state;
		this.capital = capital;
		
	}
	void displayState() {
		System.out.println("state is ="+state);
	}

	void displayCapital() {
		System.out.println("capital is ="+capital);
	}

	void displayInfo() {
//		System.out.println("state is ="+state);
//		System.out.println("capital is ="+capital);
		displayState();
		//this.displayState(); Compiler adds this to refer to instance method
		displayCapital();
		//this.displayCapital();Compiler adds this to refer to instance method
	}
}


