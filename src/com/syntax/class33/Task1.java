package com.syntax.class33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {

	public static void main(String[] args) throws IOException {
		// Create a property file to store following configurations:

		// browser=chrome
		// url=https://facebook.com
		// username
		// password
		String filePath = "facebook\\Files";

		// 2. create an object of FileInputStream class
		FileInputStream fis = new FileInputStream(filePath);

		// to work with property file we use Properties class in Java
		Properties prop = new Properties();
		prop.load(fis);

		String browser = prop.getProperty("browser");
		System.out.println(browser);

		String url = prop.getProperty("url");
		System.out.println(url);

		String username = prop.getProperty("username");
		System.out.println(username);

		String password = prop.getProperty("password");
		System.out.println(password);

	}

}
