package com.IdentifyLinkUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Url {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		String expected_Url=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println("Expected Url is: "+expected_Url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println("Actual Url is : "+ actual_Url);
		
		if(actual_Url.equals(expected_Url))
		{
			System.out.println("Successfull navigated -- PASS");
		}
		else
		{
			System.out.println("Failed to Navigate -- FAIL");
		}
		
		driver.close();

	}

}
