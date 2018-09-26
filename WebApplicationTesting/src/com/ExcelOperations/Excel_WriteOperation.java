package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

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
		
		// creating a Row in the Sheet
		Row r=sheet.createRow(2);
		
		// creating a Cell in the Row
		Cell c=r.createCell(3);
		
		// Writing the data into the Row of a cell created
		c.setCellValue("Gayatri");
		
		// to send the data into a file and save the File
		FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\ExcelTestDataFiles\\SingleTestData.xlsx");
		workBook.write(file1);

	}

}
