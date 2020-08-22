package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		//Create an arraylist of cars and retrieve all the values using 3 different ways.
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Toyota");
		cars.add("Ford");
		cars.add("Mustang");
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Hyundai");
		
		System.out.println(cars);
		
		for (String c : cars) {
			System.out.print(c + ", ");
			
		}
		System.out.println();
		Iterator<String> StringIT = cars.iterator();

		while (StringIT.hasNext()) {
			String element = StringIT.next();
			
			}
		System.out.println(cars);
		}

	
	
		
		
		

		
	}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
