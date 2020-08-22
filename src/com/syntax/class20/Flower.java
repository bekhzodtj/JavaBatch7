package com.syntax.class20;

public class Flower {

	String type;

	// if you are not going to create a constructor,-->Compiler WILL create 1 for
	// you
	// Flower(){//default non argument
	//
	// }

	//if you create a Constructor then compiler WILL NOT CREATE any other contructer for you
	Flower(String flowerType) {
		type = flowerType;
	}
	
	void Flower(){
		System.out.println("Printing whatever");
	}
	public void display() {
		System.out.println(type);
	}

	public static void main(String[] args) {
		
		
		
		//Flower flower = new Flower();
		
		//System.out.println(flower.type);
		Flower flower2 = new Flower("Tulip");
		
		flower2.display();
		flower2.Flower();
	}
}
