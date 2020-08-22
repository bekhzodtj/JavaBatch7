package com.syntax.class19_1;

import com.syntax.class19.Employee;

public class AccessingEmployeeMembers {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.lastName="Olivia";//accessing public variable
		emp.name="Luis";//accessing public variable
		
		//emp.age-->protected not visible
		//emp.salary-->protected not visible
		//emp.ssn-->protected not visible
		
		emp.displayName();
		

	}

}
