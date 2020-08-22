package com.syntax.class18;

public class Employee {
	//Create a Class called Employee:
	//Create three  variables  eID , salary and set the CEO to “Sumair” 
	//Create two objects of the class Employee 
	//Set the value of eID, salary for each of the objects
	//Print out the eID , salary and  CEO for each of the objects
	
	//int id ;
	//double salary;
	static String ceo = "Sumair";
	
	
	void printEmployee (String name, int id, double salary) {
		System.out.println("Employee name " + name + " | Employee ID "+id+ " | salary $"+salary+" | CEO "+ceo);
	}
	
	public static void main(String[] args) {
		Employee em1 = new Employee();
		//em1.id= 0123456;
		//em1.salary=500.52;
		
		em1.printEmployee("Kerem", 123456, 500.52);
		
		Employee em2 = new Employee();
		//em2.id=215566;
		//em2.salary=682.55;
		em2.printEmployee("Ibrahim", 215566, 682.55);
	}
	
	
}
