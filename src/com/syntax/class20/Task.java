package com.syntax.class20;

public class Task {
	// Write a program that will have a constructor: one with parameters and second
	// without any parameters. Create a separate Test class where you will execute
	// both of the constructors 1 by 1.
	String tsk;
	Task(String str) {
		tsk = str;
	}
	Task(){
		System.out.println("without any parameters");
		
	}
	
	void printTask() {
		System.out.println(tsk);
	}


	
}
