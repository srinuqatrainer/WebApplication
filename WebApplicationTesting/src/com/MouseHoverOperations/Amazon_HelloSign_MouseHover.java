package com.MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSign_MouseHover {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		
		//  id="nav-link-yourAccount"
		
		WebElement helloSignIn=driver.findElement(By.id("nav-link-yourAccount"));
		
		// to perform Mouse or KeyBoard Operations we use Actions class
		// creating an object for Actions class and passing an argument as driver(because i want to perform action on the
		// Application / on the webPage)
		Actions act = new Actions(driver);
		
		// using Actions class Object we perform some actions
		// using a method called as moveToElement we perform the action on the Element
		// using "build().perform()" - we perform the operation either related to KeyBoard or Mouse 
		
		Thread.sleep(10000);
		
		act.moveToElement(helloSignIn).build().perform();
		
		// <span class="nav-text">Your Wish List</span>
		// <span class="nav-text">Your Orders</span>
		
		// xpath of Your Wish List -- .//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span
		
		driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span")).click();
		
		
		

	}

}
