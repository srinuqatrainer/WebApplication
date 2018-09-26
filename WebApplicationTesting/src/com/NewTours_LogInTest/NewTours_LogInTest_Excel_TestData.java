package com.NewTours_LogInTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest_Excel_TestData {

	public static void main(String[] args) throws IOException 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// Identify the file on the System
		//FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\GayatriSelenium\\WebApplicationTesting\\ExcelTestDataFiles\\SingleTestData.xlsx");
				//or
FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ExcelTestDataFiles\\NewTours_LogInTestData.xlsx");
				
				// Identify the WorkBook in the File
XSSFWorkbook workBook = new XSSFWorkbook(file);
				
				// Identify a particular sheet in the WorkBook
XSSFSheet sheet = workBook.getSheet("Sheet1");
		
	// identify the row in the sheet
Row r=sheet.getRow(1);

   // Identify the Row of a cell
Cell c=r.getCell(0);

	// get the data from the row of a cell 
String userName=c.getStringCellValue();
		
		// <input type="text" size="10" name="userName">
		driver.findElement(By.name("userName")).sendKeys(userName);
		
// Identify the Row of a cell
	Cell c1=r.getCell(1);
	
// get the data from the row of a cell 
	String password=c1.getStringCellValue();
	
		driver.findElement(By.name("password")).sendKeys(password);
		
		
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		String actual_Tite=driver.getTitle();
		
		if(actual_Tite.contains(expected_Title))
		{
			System.out.println("Successfully Logged into NewTours -- PASS");
			Cell c2=r.createCell(2);
			c2.setCellValue("Successfully Logged into NewTours -- PASS");
		}
		else
		{
			System.out.println("User Failed to LogIn -- FAIL");
			Cell c2=r.createCell(2);
			c2.setCellValue("User Failed to LogIn -- FAIL");
		}
		
		// to send the data into a file and save the File
				FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\ExcelTestDataFiles\\NewTours_LogInTestData.xlsx");
				workBook.write(file1);
	
		driver.close();

	}

}
