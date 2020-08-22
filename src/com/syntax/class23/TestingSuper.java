package com.syntax.class23;

public class TestingSuper {

	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		obj.displayName();
		obj.callingParentMethod();
		
		SuperClass obj1 = new SuperClass();
		obj.printHello();
		System.out.println(obj1.name);

	}

}
