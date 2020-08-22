package com.syntax.class25;

public class Store {
	String name, location;

	public Store(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public void openHours() {
		System.out.println(name + " is open from 8am - 8pm "+location);
	}

	public void sell() {
		System.out.println("Store sale items "+location);
	}

}

class Macys extends Store {
	public Macys(String name, String location) {
		super(name, location);
	}

	public void openHours() {
		System.out.println(name + " is open from 8am - 12am "+location);
	}
}

class Starbucks extends Store {

	public Starbucks(String name, String location) {
		super(name, location);
	}

	public void openHours() {
		System.out.println(name + " is open everyday from 6am - 8pm "+location);
	}

	public void sellDrinks() {
		System.out.println(name + " sell diffrent type of "+location);
	}
}

class Nike extends Store {
	
	String shoes;
	
	public Nike(String name, String location,String shoes) {
		super(name, location);
		this.shoes=shoes;
	}
}
