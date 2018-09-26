package com.KeyBoardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook__LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
// <input id="email" class="inputtext" type="email" data-testid="royal_email" tabindex="1" name="email"/>
		
		driver.findElement(By.id("email")).sendKeys("Gayatri");
		
		Actions act = new Actions(driver);
		
		// Tab operation from the keyboard Using Actions class object
		act.sendKeys(Keys.TAB).build().perform();
		
		// automating Password element using actions class object
		act.sendKeys("Hello").build().perform();
		
		// "Enter" keyboard operation from the Keyboard
		act.sendKeys(Keys.ENTER).build().perform();

	}

}
