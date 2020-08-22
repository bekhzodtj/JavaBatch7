package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		Map<String, String> country = new LinkedHashMap<>();
		country.put("Tajikistan", "Dushanbe");
		country.put("Uzbekistan", "Tashkent");
		country.put("Russia", "Moscow");
		country.put("Canada", "Toronto");
		country.put("USA", "Washington DC");
		country.put("Turkey", "Istanbull");
		
		System.out.println(country);
		
		Collection<String>values=country.values();
		for(String val:values) {
			System.out.println(val);
		}
		Iterator<String> it = country.iterator();
		while (it.hasNext()) {
			String v = it.next();
			System.out.println(v);
		}

	}

}
