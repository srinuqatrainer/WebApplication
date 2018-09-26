package com.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://my.monsterindia.com/sponsered_popup.html");
		
		// Identifying Current Location Element
		// <select class="border_grey1"
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		// to make a selection from a dropDown we have class called "Select" class
		Select selection = new Select(currentLocation) ;
		
		// using the Object(selection) created for Select Class we make a selection
		//selection.selectByVisibleText("Chennai");
		//selection.selectByIndex(2);
		selection.selectByValue("491");
		
		
		// Industry Element
		// <select id="id_industry" 
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select sele = new Select(industry);
		sele.selectByIndex(1);
		sele.selectByValue("4");
		sele.selectByVisibleText("Banking/ Financial Services");
		
		// DeSelect all the Selected Optional Values from a dropDown
		sele.deselectAll();
		
		
		
	}

}
