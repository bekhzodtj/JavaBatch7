package com.syntax.class18;

public class InstanceVaribles {

	String name="Yuriy";//instance variable
	
	
	public static void main(String[] args) {
		
		String name="Kristina";//local variable
		System.out.println(name);
		
		//we create an Object or instanciate a class or create an instance of the class 
		InstanceVaribles obj=new InstanceVaribles();
		obj.name="Jane";
		System.out.println(obj.name);//Jane
		
		//would like to change value from Kristina to Castro
		name="Castro";
		System.out.println("New value of the local variable: "+name);
		
		//would like to change Jane to Ed-->changeing value of the instance variable
		obj.name="Ed";
		System.out.println("New value of the instance variable: "+obj.name);
		
		System.out.println("Printing value of name using 2 instance ");
		InstanceVaribles obj1=new InstanceVaribles();
		System.out.println(obj1.name);

	}

}
