package com.syntax.class20;

public class ContructorTypes {

	ContructorTypes() {//non argument constructor
		System.out.println("I am a constructor");
	}

	ContructorTypes(String str) {//Parameterized constructor
		System.out.println("I am a constructor with 1 parameter"+str);
	}

	ContructorTypes(int num) {
		System.out.println("I am a constructor with 1 int parameter " + num);
	}

	ContructorTypes(double num) {
		System.out.println("I am a constructor with 1 double parameter " + num);
	}
	
	ContructorTypes(String name,int age){
		System.out.println("I am a constructor with 2 parameters "+name+" "+age);
	}

	public static void main(String[] args) {

		ContructorTypes obj = new ContructorTypes("Aidana", 18);

		System.out.println("I am a code inside main method");
		speak("Hello Class");
	}

	static void speak(String str) {
		System.out.println(str);
	}

}
