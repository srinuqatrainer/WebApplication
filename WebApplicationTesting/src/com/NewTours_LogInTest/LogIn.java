package com.NewTours_LogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <input type="text" size="10" name="userName">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		String actual_Tite=driver.getTitle();
		
		if(actual_Tite.contains(expected_Title))
		{
			System.out.println("Successfully Logged into NewTours -- PASS");
		}
		else
		{
			System.out.println("User Failed to LogIn -- FAIL");
		}
	
		driver.close();
		
		
		

	}

}
