package com.syntax.class19;

public class Task {

	// Create a method that will accept an array as parameters and will return a sum
	// of all elements from that array. Method should be visibly only within same
	// package and accessible by the creating an instance of the class.
	private int sumOfArray(int[] sum) {
		int num = 0;
		for (int i: sum) {
			num = num+i;
		}
		return num;
	}
	
	public static void main(String[] args) {
		Task obj = new Task();
		int [] array = {3,10,20};
		int sum = obj.sumOfArray(array);
		System.out.println(sum);
		
	}
	
}
