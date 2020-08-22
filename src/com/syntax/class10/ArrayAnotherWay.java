package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		//we created an array and stored the initial values
		String [] weekdays = {"Monday","Tuesday","Wendnesday","Thursday","Friday"};
		
		//let us print the element with index 3
		System.out.println(weekdays[3]);
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);
	
		//we cannot add elements to the array
		//weekdays[5] = "Saturday"; //runtime error
		
		double[] balance = {10000, 23.50,5540.0};
		System.out.println("Tatal money is "+ (balance[0]+balance[1]+balance[2]));
		
		//2nd way 
		int total1 = (int) balance[0] + (int) balance[1] + (int) balance[2];
		System.out.println("Totals1 is: " + total1);
		
		//3rd way
		int total2 = (int) (balance[0] + balance[1] + balance[2]);
		System.out.println("Totals2 is: " + total2);
		
		//Don't ever create an array with 0 element
		//Because you cannot add elements later
		int[] numbers1 = new int [0];
		
		int[] numbers2 = {};
		numbers2[0] = 5;
		System.out.println(numbers2[0]);

	}

}
