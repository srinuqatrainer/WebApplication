package com.DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistation
{

	//FirefoxDriver driver;
	
	ChromeDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException
	{
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\GayatriSelenium\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		
		driver.get("http://newtours.demoaut.com");
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}


	@Test(priority=0)
	public void register()
	{
		// <a href="mercuryregister.php">REGISTER</a>
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	
	@Test(priority=1)
	public void userRegistration() throws IOException
	{
		
		// Identify the file on the System
FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ExcelTestDataFiles\\NewUserRegistrationTestData.xlsx");
				
				// Identify the WorkBook in the File
				XSSFWorkbook workBook = new XSSFWorkbook(file);
				
				// Identify a particular sheet in the WorkBook
				XSSFSheet sheet = workBook.getSheet("Sheet1");
				
				// identify how many rows with the Test Data
				int rowCount=sheet.getLastRowNum();
				
				for(int i=1;i<=rowCount;i++) // it iteratate till the last Row number with data
				{
					Row r=sheet.getRow(i); // it goes to a particular(i value) row
			
					driver.findElement(By.name("firstName")).clear();
					driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
					
					driver.findElement(By.name("lastName")).clear();
					driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
					
					// converting a NumericCellValue to a String -- this is called as Type Casting
					double d=r.getCell(2).getNumericCellValue();
					long x=(long)d;
					String phoneNumber=Long.toString(x);
					
					driver.findElement(By.name("phone")).clear();
					driver.findElement(By.name("phone")).sendKeys(phoneNumber);
					
					driver.findElement(By.id("userName")).clear();
					driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
					
					driver.findElement(By.name("address1")).clear();
					driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
					
					driver.findElement(By.name("city")).clear();
					driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
					
					driver.findElement(By.name("state")).clear();
					driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
					
					// converting a NumericCellValue to a String -- this is called as Type Casting
					double p=r.getCell(7).getNumericCellValue();
					long y=(long)p;
					String postalCode=Long.toString(y);
					
					
					driver.findElement(By.name("postalCode")).clear();
					driver.findElement(By.name("postalCode")).sendKeys(postalCode);
					
					driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
					
					driver.findElement(By.id("email")).clear();
					driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
					driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
					driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
					
					driver.findElement(By.name("register")).click();
					
					
					// Validating the UserName 
					
					// xpath of Registed User text -- html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b
					
					String actualUserRegisteredText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
					
					String expectedUserName=r.getCell(9).getStringCellValue();
					
					if(actualUserRegisteredText.contains(expectedUserName))
					{
						System.out.println(" User Registered Successfully"+"  "+r.getCell(9).getStringCellValue());
						
						r.createCell(12).setCellValue("User Registered Successfully");
					}
					else
					{
						System.out.println(" User Registration Failed"+"  "+r.getCell(9).getStringCellValue());
						
						r.createCell(12).setCellValue("User Registration Failed");
					}
					
		// to send the data into a file and save the File
	FileOutputStream file1 = new FileOutputStream(System.getProperty("user.dir")+"\\TestResultFiles\\NewTours_NewUserRegistrationTestResult.xlsx");
						workBook.write(file1);

						driver.navigate().back();
					
					
				}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
