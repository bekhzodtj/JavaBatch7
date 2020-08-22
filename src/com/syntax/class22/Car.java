package com.syntax.class22;

public class Car {
	
	String make;
	
	public Car() {
		System.out.println("I am non argument constructor of parent class");
	}

}

class Tesla extends Car {

	boolean autopilot;
	Tesla() {
		System.out.println("I am non argument constructor of child class");
	}
	void info() {
		System.out.println("We build "+make+" that has autopilot feature "+autopilot);
	}
}