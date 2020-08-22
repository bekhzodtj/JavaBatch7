package com.syntax.class15;

public class ReplaceFunction {

	public static void main(String[] args) {

		String me = "I am good tester. I am good person";

		String str = "Hello";

		str = str.replace('e', 'E');
		System.out.println(str);

		me = me.replace("good", "great");
		System.out.println(me);

		me = me.replace("we", "us");// if it find it --> replace if it will nor ---> does nothing
		System.out.println(me);
		//replacing all character from A-Z

		String fromApplication = "Phone number is 1234567890";
		
		fromApplication = fromApplication.replaceAll("[A-Z]", "");
		System.out.println(fromApplication);
		
		fromApplication = fromApplication.replaceAll("[a-z]", "").trim();
		System.out.println("New String value is ="+fromApplication);
		
		String another="Hello123456";
		another=another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
		System.out.println(another);
		
		String anotherWay="HelloYIIghffjgki65766565";
		anotherWay=anotherWay.replaceAll("[A-Za-z]","");//12345
		
		System.out.println(anotherWay);
		
		//replace all number from the String, if specific[0-5]
		String mix = "Hello75698 friends 556335589";
		mix=mix.replaceAll("[0-9]", "");//Hello friends
		System.out.println(mix);
		
		//Replacing all special characters
		String mix1="hello @#$%&*%$#";
		mix1=mix1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(mix1);
		

	}

	

}
