package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		// Create variable to store temperature. Your program should check if
		// temperature is below 32 then it should print "Water will freeze with
		// temperature __", otherwise "Water will NOT freeze with temperature __".
		double temp = 33;
		double tfr = 32;
		if (temp < tfr) {
			System.out.println("Water will freeze with temperature" +temp);
		}
		else {
			System.out.println("Water will NOT freeze with temperature " +temp);
		}

	}

}
