package com.syntax.class11;

public class HomeWork2 {

	public static void main(String[] args) {
		// Create an array of cars : American, German, Korean, Italian. 
		//Then retrieve all values from that array using 2 different loops
		String [][] cars = {
				{"Cadillac","GMC","Jeep"},
				{"BMW","Mercedes-Benz","Audi"},
				{"Hyundai","KIA","Daewoo"},
				{"Lamborghini","Maserati","Ferrari"}
		};
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length;j++) {
				System.out.print(cars[i][j]+ ", ");
			}
		   System.out.println();
		}
		
		System.out.println("--------------2nd way-------------");

		for (String[] car : cars) {
			for(String c:car) {
				System.out.print(c + ", ");
			}
			System.out.println();
		}
		
		
		
	}

}
