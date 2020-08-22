package com.syntax.class30;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList <String> food = new LinkedList<>();
		food.add("Beshparmak");
		food.add("Pizza");
		food.add("Biryani");
		food.add("Tacos");
		
		String myFood = food.get(2);
		System.out.println(myFood);
		
		LinkedList<String>deserts = new LinkedList<>();
		deserts.add("Cake");
		deserts.add("Ice Cream");
		deserts.add("Cookies");
		
		food.addAll(deserts);
		System.out.println("LinkedList after adding another collection = "+food);
		
		food.remove("Pizza");
		System.out.println("LinkedList after removing elements = "+food);
		
		food.set(3, "Brownie");
		System.out.println("LinkedList after replasing elements = "+food);
		
		//I want to get all values 1 by 1
		
		Iterator<String>foodIterator = food .iterator();
		while (foodIterator.hasNext()) {
			String fooood=foodIterator.next();
			System.out.print(fooood+" ");
			if(fooood.equals("Cookies") || fooood.equals("Brownie")){
			foodIterator.remove();
			}
		}
		System.out.println();
		System.out.println("LinkedList after Iterator ="+food);
		
		
		//Lets create list with Country type of object
		LinkedList<Country>countries=new LinkedList<>();
		countries.add(new USA("USA"));
		countries.add(new Kazakhstan("Kazakhstan"));
		countries.add(new Afghanistan("Afghanistan"));
		
		System.out.println("Collection of Counrty Object hes "+countries.size()+" elements");
		
		for(Country c:countries) {
			c.election();
		}
		//creating an Object of LinkedList and storing inside List type of variable
				List<String> webelements=new LinkedList<>();
				webelements.add("Link");
				webelements.add("radio button");
				webelements.add("checkbox");

	}

}
