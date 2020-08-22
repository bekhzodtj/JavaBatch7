package com.syntax.class16;

public class DiffrentMethodsTest {

	public static void main(String[] args) {
		DiffrentMethods obj =new DiffrentMethods();
		//call method sayHello
		obj.sayHello(2);
		System.out.println("------------");
		System.out.println(5);
		
		
		//call method printAnyWord
		obj.printAnyWord("I love you",3);		
		obj.printAnyWord("Bye", 5);
		
		//call method isHungry
		obj.isHungry(false);
	}

}
