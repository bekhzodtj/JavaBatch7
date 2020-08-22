package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		//1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		char [] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		System.out.println("Grade "+ grades[1]);
		
		System.out.println("-----------2nd way---------");
		
		//char [] grade = { "A"
		
		//1.Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names = {"Baha","John","Mac","Bekhzod","Qudbidin"};
		System.out.println(names[3]);
		
		System.out.println("------------------2nd-----------");
		
		
		
		System.out.println("--------------Taks3---------------");
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		String[]words= {"Jave","Saturday","day","coding","is"};
		
		System.out.println(words[1] + " "+ words[4] + " " + words[0]+ " " + words[3] + " " + words[2]);
		
				
				
		

	}

}
