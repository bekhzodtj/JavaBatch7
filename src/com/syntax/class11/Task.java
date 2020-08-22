package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		// Create an array of cars and store elements into it.
		// print all values from the array
		String[] cars = { "BMW", "Toyota", "Honda", "Farari", "Mercedes Benz", "Lexus" };
		for (String car : cars) {
			System.out.println(car);
		}
		System.out.println("-----------------------------");
		// Create an array of integers and calculate the sum of all elements in an
		// array.

		int[] numbers = { 23, 56, 73, 16, 80, 70, 39 };
		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}
		System.out.println("The sum of all number is: " + sum);

		System.out.println("-------Using for loop--------");
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			total += num;
		}
		System.out.println("The total of all number is " + total);

		System.out.println("---------------------------------");
		// Create an array of countries while retrieving all values from an array
		// print capital for each country(using if or switch)
		String[] countries = { "Tajikistan", "Brazil", "Pakistan", "Gambia", "US" };

		// Elion way

		String[] capitalCities = { "Dushanbe", "Brasilia", "Islamabad", "Banjul", "Washington DC" };

		for (int i = 0; i < countries.length; i++) {

			String country = countries[i];

			String city = capitalCities[i];

			System.out.println("The capital city of " + country + " is " + city);

		}

		// HW: Try to solve this way with enhanced for loop

		// Hint: You should not be able to do it

		for (String country : countries) {


		if (country.equals("Albania")) {

			System.out.println("Tirana");

			} else if (country.equals("Brazil")) {

				System.out.println("Brasilia");

			} else if (country.equals("US") || country.equals("USA")) {

				System.out.println("Washington DC");

			} else if (country.equals("Tajikistan")) {

				System.out.println("Dushanbe");

			} else if (country.equalsIgnoreCase("Gambia")) {

			System.out.println("Banjul");

			} else {

				System.out.println("The country " + country + " is not in my list.");

		}

	}


		System.out.println("---------2nd way------------");

		for (int i = 0; i < countries.length; i++) {


			switch (countries[i]) {

			case "Tajikistan":

				System.out.println("Dushanbe");

			break;

			case "US":

			case "USA":

				System.out.println("Washington DC");

				break;

			case "Brazil":

				System.out.println("Brasilia");

				break;

			case "Albania":

				System.out.println("Tirana");

				break;

			case "Gambia":

				System.out.println("Banjul");
				break;

			default:

				System.out.println("Not in my list");

			}


		}

	}

}
