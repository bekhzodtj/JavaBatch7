package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Task01 {
	// Create a Set collection in which you need to add names of the countries. In
	// this set we want all objects to be sorted in alphabetical order. Using 2
	// different ways retrieve all elements from set.
	
	public static void main(String[] args) {
		
		HashSet<String> countries = new HashSet<>();
		countries.add("Tajikistan");
		countries.add("USA");
		countries.add("Turkey");
		countries.add("Uzbekistan");
		countries.add("Paris");
		countries.add("UK");
		
		System.out.println(countries.size());
		System.out.println(countries);
	}
	
}

