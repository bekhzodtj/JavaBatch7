package com.syntax.class21;

public class MathTeacher extends Teacher {
	boolean teaching=true;
	boolean algebra=true;
	
	void displayMath() {
		System.out.println(name+" "+lastName+" " +age+ " years old "
				+teaches+" teacher years of experience "+experience+" year, teaching at the moment "+teaching);
	}

}
