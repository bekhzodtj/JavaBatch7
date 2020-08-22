package com.syntax.class14;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		//Accept username, password and confirm password from a user and check following requirements:
		
		// 1 Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
		
		// 2 Password should be minimum 8 characters, if less → message=“Password is too short”.
		
		// 3 Password cannot contain username if so, → message=“Password cannot contain username”.
		
		// 4 Password should match confirmed password, if not  → message=“Passwords do not match”
		
		// Only after all requirements met → message “Your username and password has been created”
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter Username");
		
		String userName = "Bekhzod1";
		String password = "Bekhzod123";
		String password2 = "Bekhzod123";
		if (userName.length()==0) {
			System.out.println("Username cannot be empty");
		}
		if (password.length()==0) {
			System.out.println("Password cannot be empty");
		}
		if (password.length()<8) {
			System.out.println("Password must be 8 characters!");
		}
		if (password.equalsIgnoreCase(userName)) {
			System.out.println("Password cannot be same as user name");
		}
		if (!password.equals(password2)) {
			System.out.println("Password does not match");
		}
	

	}

}
