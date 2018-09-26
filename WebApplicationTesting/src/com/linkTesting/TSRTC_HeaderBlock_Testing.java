package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderBlock_Testing {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.tsrtconline.in/oprs-web/");
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		// identifying the Header Block of the WebPage
		// <div class="menu-wrap">
		
	WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
	// Getting all the elements of the headerBlock into ArrayList(headerBlockLinks)
	List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
	
	int links_Count=headerBlockLinks.size();
	System.out.println("Total No of Links in HeaderBlock are : " +links_Count);
	
	
	for(int i=0;i<headerBlockLinks.size();i++)
	{
		String headerBlockLinkName=headerBlockLinks.get(i).getText();
		System.out.println(i+" "+headerBlockLinkName);
		
		headerBlockLinks.get(i).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(5);
		
		// Identifying the HeaderBlock again
		headerBlock=driver.findElement(By.className("menu-wrap"));
		// Recreating the Array list again to store all the elements with tagName "a"
		headerBlockLinks=headerBlock.findElements(By.tagName("a"));
			
	}	
	
	driver.close();
		

	}

}
