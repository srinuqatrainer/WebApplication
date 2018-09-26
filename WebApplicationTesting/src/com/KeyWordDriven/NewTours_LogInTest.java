package com.KeyWordDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest
{

FirefoxDriver driver;
	

	@BeforeTest
	public void setUp() throws InterruptedException
	{
		driver = new FirefoxDriver();

	
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(10);
	}
	
	@Test
	public void logIn() throws IOException, InterruptedException
	{
		// Identify the file on the System
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ExcelTestDataFiles\\NewTours_LogIn_MultileTestData.xlsx");
		
		// Identify the WorkBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		// Identify a particular sheet in the WorkBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// identify how many rows with the Test Data
		int rowCount=sheet.getLastRowNum();
		
		// Identifying the properties file in the Project in which the properties of an Elements are saved
		
		
		
		
		for(int i=1;i<=rowCount;i++) // it iteratate till the last Row number with data
		{
			Row r=sheet.getRow(i); // it goes to a particular(i value) row
			
			Cell c=r.getCell(0); // it goes to a particular row and to a particular Cell
			
			String userName=c.getStringCellValue(); // it get the data from Row of a Cell
			
			Cell c1=r.getCell(1); // goes to a particular (i value) row of cell
			
			String password=c1.getStringCellValue(); //it gets the data from Row of Cell
		
			FileInputStream file01 = new FileInputStream(System.getProperty("user.dir")+"\\newTours.properties");
			
			// creating an object for Properties class
			Properties pr = new Properties();
			
			// using properites class object load the file 
			pr.load(file01);
			
			// <input type="text" size="10" name="userName">
			driver.findElement(By.name(pr.getProperty("uName"))).sendKeys(userName);
			
			driver.findElement(By.name(pr.getProperty("pwd"))).sendKeys(password);
			
			driver.findElement(By.name(pr.getProperty("signIn"))).click();
					
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
FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\TestResultFiles\\NewTours_LogInTestResultData.xlsx");
	workBook.write(file1);

	driver.findElement(By.linkText("SIGN-OFF")).click();
			
		}
}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
}
