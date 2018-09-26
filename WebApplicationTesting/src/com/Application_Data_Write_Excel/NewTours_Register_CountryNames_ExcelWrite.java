package com.Application_Data_Write_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryNames_ExcelWrite {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <a href="mercuryregister.php">REGISTER</a>
		driver.findElement(By.linkText("REGISTER")).click();
		
		// <select size="1" name="country">
		WebElement country=driver.findElementByName("country");
		
		// capturing all the CountryNames from country dropDown
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		System.out.println(countryNames.size());
		
		// Identify the file on the System
				//FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\GayatriSelenium\\WebApplicationTesting\\ExcelTestDataFiles\\SingleTestData.xlsx");
				//or
FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ExcelTestDataFiles\\CountryNames.xlsx");
				
				// Identify the WorkBook in the File
XSSFWorkbook workBook = new XSSFWorkbook(file);
				
				// Identify a particular sheet in the WorkBook
XSSFSheet sheet = workBook.getSheet("Sheet1");

		
		for(int i=0;i<countryNames.size();i++)
		{
			String countryName=countryNames.get(i).getText();
			System.out.println(countryName);
			
			Row r=sheet.createRow(i);
			Cell c=r.createCell(0);
			
			c.setCellValue(countryName);
			
			// to send the data into a file and save the File
			FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\ExcelTestDataFiles\\CountryNames.xlsx");
			workBook.write(file1);
			
			
		}
		

		driver.close();
	}

}
