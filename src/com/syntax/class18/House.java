package com.syntax.class18;

public class House {

	public static void main(String[] args) {
		Cat cat1 = new Cat();// cat1 -->local varible
		cat1.name = "Jassy";
		cat1.age = 8;
		cat1.color = "Grey";

		System.out.println("Namber of paws " + Cat.paws);
		
		System.out.println("Yellow");//declaring local variable

		Cat cat2 = new Cat();
		cat2.name = "Lucy";
		cat2.age = 1;
		cat2.color = "Wtite";
		cat2.name = "Bonchuk";
		cat2.mustache = false;//possible way but not the right way
		Cat.tail=false;
		
//		System.out.println("Name of 1st cat= " + cat1.name);
//		System.out.println("Age of cat " + cat1.age);
//		System.out.println("Name of 2nd cat= " + cat2.name);
		
		System.out.println("----Printing values of 1 cat----");
		cat1.displayCat();
		cat1.displayCommonFeatures();
		
		System.out.println("----Printing values of 2 cat----");
		cat2.displayCat();
		cat2.displayCommonFeatures();

		Cat cat3 = new Cat();
		cat3.name = "Kathy";
		cat3.age = 4;
		cat3.color = "black";
		
		System.out.println("----Printing values of 3 cat----");
		cat3.displayCat();
		cat3.displayCommonFeatures();

	}

}
