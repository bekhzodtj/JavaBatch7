package com.syntax.class21;

public class Task {
	// Write a Student class that have instance variables name and address. Create a
	// constructor that will initialize those variables. Print name & address of
	// given student using displayInfo method.

	public static String student;
	String name;
	String address;

	Task(String name, String address) {
		this.name = name;
		this.address = address;		
}
	void displayInfo() {
		System.out.println("Student Name "+name);
		System.out.println("Student Address "+address);
	}
	public static void main(String[] args) {
		Task obj = new Task("John Smith","55 Ditmas ave Brooklyn");
		obj.displayInfo();
	}

}
