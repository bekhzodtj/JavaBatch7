package com.syntax.class12;

public class ArrayRecap {

	public static void main(String[] args) {
		String []colors = new String[3];
		colors[0]="Blue";
		colors[1]="Yellow";
		colors[2]="Red";
		
		System.out.println(colors.length);
		
		for (int i = 0;i < colors.length;i++) {
			String color=colors[i];
			System.out.println(color);
		}
		for(String c: colors) {
			System.out.println(c);
		}

	}

}
