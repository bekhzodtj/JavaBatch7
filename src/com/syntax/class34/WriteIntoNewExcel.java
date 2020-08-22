package com.syntax.class34;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoNewExcel {

	public static void main(String[] args) throws IOException {
		Workbook wbook = new XSSFWorkbook();
		Sheet sheet = wbook.createSheet("My Sheet");
		sheet.createRow(0).createCell(0).setCellValue("I am writing");
		
		String filePath = System.getProperty("user.dir")+"\\Testdata\\MyFile.xlsx";
		
		FileOutputStream fos = new FileOutputStream(filePath);
		
		wbook.write(fos);		
		wbook.close();
		fos.close();

	}

}
