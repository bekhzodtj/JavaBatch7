package com.syntax.class19;

public class AccessingEmployeeClassMembers {

	public static void main(String[] args) {
	
		Employee emp=new Employee();
		emp.name="Bekhzod";
		emp.lastName="Azimurodov";
		emp.age=32;
		emp.salary=100000;
		//emp.ssn-->wont be available because it is private
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		//emp.displaySsn();//wont be available because it is private
	}

}
