package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException
	{
		// Identify the file on the System
		//FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\GayatriSelenium\\WebApplicationTesting\\ExcelTestDataFiles\\SingleTestData.xlsx");
		//or
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ExcelTestDataFiles\\SingleTestData.xlsx");
		
		// Identify the WorkBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		// Identify a particular sheet in the WorkBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// Identify a Row in the Sheet
		Row r=sheet.getRow(0);
		
		// Identify a Cell in the Row
		Cell c=r.getCell(0);
		
		// Get the Data from the Row of a Cell
		String data=c.getStringCellValue();
		
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		

	}

}
