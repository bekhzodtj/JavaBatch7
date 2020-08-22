package com.syntax.class25;

public class TestClass {
	public static void main(String[] args) {
		SuperClass c = new Subclass();
		c.enjoy();
		
		SuperClass.enjoy();
		Subclass.enjoy();

	}

}
