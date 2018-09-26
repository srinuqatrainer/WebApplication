package com.FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbook_LogInTest {

	public static void main(String[] args)
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		// <input id="email" class="inputtext" type="email" data-testid="royal_email" tabindex="1" name="email">
		driver.findElement(By.className("inputtext")).sendKeys("gayatri");		
		
		// <input id="pass" class="inputtext" type="password" data-testid="royal_pass" tabindex="2" name="pass">
		//driver.findElement(By.className("inputtext")).sendKeys("hello");
		
		driver.findElement(By.name("pass")).sendKeys("hello");

	}

}
