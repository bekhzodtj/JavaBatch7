package com.syntax.class21;

public class Constructors {
	String word;

	public Constructors() {
		System.out.println("I am a non argument constructor");
	}

	public Constructors(String word) {
		this(12, word);
		this.word = word;
		System.out.println("I am a parameterized constructor with str =" + word);
	}

	Constructors(int num) {
		System.out.println("I am Constructor with 1 parameter = " + num);
	}

	Constructors(int num, String word) {
		System.out.println("I am Constructor with 2 parameter = " + num + " and " + word);
	}

	public static void main(String[] args) {
		Constructors obj = new Constructors("Java");
		System.out.println(obj.word);
	}
	

}
