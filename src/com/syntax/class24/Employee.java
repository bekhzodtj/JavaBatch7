package com.syntax.class24;

public class Employee {
	double salary;
	
	void getPaid() {
		System.out.println("Employee get paid salary ="+salary);
	}

}
class Contractor extends Employee {
	double hourlyRate;
	
	void getPaid () {
		System.out.println("Contractor get paid hourly rate ="+hourlyRate);
	}
}
class FulltimeEmployee extends Employee {
	
}

