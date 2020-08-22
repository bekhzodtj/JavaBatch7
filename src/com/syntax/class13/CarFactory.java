package com.syntax.class13;

public class CarFactory {
	public static void main(String[] args) {
		// building an abject of the car
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println("Make of the first car is " + car1.make);

		// building an abject of the car
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("Make if 2 car is " + car2.make);

		// new Bus ();compiler will give an error
		// because we never created Bus class
		Car car3 = new Car();
		car3.make = "Toyota";
		car3.model = "Camry";
		car3.color = "White";
		car3.year = 2020;
		car3.speed = 190;
		System.out.println("Make of 3 car is " + car3.make + " and model is " + car3.model + " and it is  " + car3.color
				+ " Color");

		System.out.println("---Accessing methods from Car class using car3---");
		car3.drive();
		car3.reverse();
		car3.transportPeople();

		Car car4 = new Car();
		car4.make = "Hyundai";
		car4.model = "Palisade";
		car4.color = "Blac";
		car4.year = 2020;
		car4.speed = 200;
		System.out.println("Make of 4 car is " + car4.make + " and model is " + car4.model + " and it is  " + car4.color
				+ " Color");
		System.out.println("---Accessing methods from Car class using car4---");
		car4.drive();
		car4.reverse();
		car4.transportPeople();

	}
}
