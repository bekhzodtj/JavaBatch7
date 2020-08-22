package com.syntax.review09;

public class MethodOverloading {
	public void method() {
		System.out.println("I am a method without any parameter");
	}
	
	public void method (String str) {
		System.out.println("I am a method with a string parameter");
	}
	
	public void method (int i) {
		System.out.println("I am a method with a int parameter");
	}
	
	public void method (String str, int i) {
		System.out.println("I am a method with one String and one int parameters");
	}
	public void method (int i, String str) {
		System.out.println("I am a method with and int and one string parameters");
	}
	public void method (String str1, String str2) {
		
	}

}
