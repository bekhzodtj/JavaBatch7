package com.syntax.class17;

public class Task {
	
	public static void main(String[] args) {
		Task obj = new Task();
		String create = obj.createEmail("Bekhzod","Azimurodov","gmail");
		System.out.println(create);
	}
	 // Create a method createEmail(). Based on values of users name, lastName and
	// email type, your method should return complete email Address. Example:
	// createEmail(John, Snow, gmail) → johnsnow@gmail.com
	
	
	
	String createEmail(String name, String lastN, String email) {
		StringBuffer stg = new StringBuffer();
		stg.append(name).append(lastN).append("@").append(email).append(".com");
		return stg.toString().toLowerCase();
		
	}

}
