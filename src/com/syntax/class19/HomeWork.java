package com.syntax.class19;

public class HomeWork {
	// Create a method that will accept a String as a parameter and return a new
	// String that consist only of vowels. Method should be available inside the
	// class where it was declared and executed by calling it is name.
	private static String Vowels(String str) {
		String newstr = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
			}
			newstr+=str.charAt(i)+" ";
		}
		return newstr;
	}

	public static void main(String[] args) {
		HomeWork vow = new HomeWork();
		String str = "hello";
		String word = vow.Vowels(str);
		System.out.print(word);

	}
}