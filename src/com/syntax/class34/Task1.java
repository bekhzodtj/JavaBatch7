package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 {

	public static void main(String[] args) throws IOException {
		// Manually create a file to store username and password
		// Using Java add 2 more lines for username and password
		// Save code in the same file

		String xlFilePath = System.getProperty("user.dir") + "\\Testdata\\Newfile.xlsx";
		FileInputStream fis = new FileInputStream(xlFilePath);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		sheet.createRow(3).createCell(0).setCellValue("Jackson");
		sheet.getRow(3).createCell(1).setCellValue("jackson123");
		sheet.createRow(4).createCell(0).setCellValue("Ashlytest");
		sheet.getRow(4).createCell(1).setCellValue("ashlytest589");
		String newXl = System.getProperty("user.dir") + "\\Testdata\\NewResults.xlsx";
		FileOutputStream fos = new FileOutputStream(newXl);
		book.write(fos);

	}

}
