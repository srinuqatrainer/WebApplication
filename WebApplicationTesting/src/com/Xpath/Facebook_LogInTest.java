package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args)
	{
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// data-testid=royal_email		
		//  //tagName[@Attribtue='value']
		// creating xpath based on other properties of an element
		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Gayatri");
		
		// creating xpath with id locator
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Gayatri");

		// creating xpath with class locator
		driver.findElement(By.xpath("//*[@class='inputtext']")).sendKeys("Gayatri");
		
		           // Automating Password Element
		
		// creating xpath based on class
		driver.findElement(By.xpath("//*[@class='inputtext' and @data-testid='royal_pass']")).sendKeys("hello");
		
	}

}
