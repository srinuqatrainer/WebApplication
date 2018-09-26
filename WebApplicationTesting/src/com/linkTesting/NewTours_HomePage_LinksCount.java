package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksCount {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
		//driver.findElementByLinkText("REGISTER").click();
		
//	WebElement register=driver.findElement(By.linkText("REGISTER"));
//	register.click();
		
		// on the browser finding all the elements which have the tag name as "a"
		// Once an element is found with tag name as a then it is going to be saved into
		// links(ArrayList) .... since an element is found and saved into links( we declare it as WebElement)
		// Since more than one element is getting saved into links we declare as List
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		// will will find the size of the Array and saves into a Variable as linksCount ..
		// since it is a size we declare as int
		int linksCount=links.size();
		
		System.out.println("Total number of links on NewTours HomePage are: "+linksCount);
		
		driver.close();

	}

}
