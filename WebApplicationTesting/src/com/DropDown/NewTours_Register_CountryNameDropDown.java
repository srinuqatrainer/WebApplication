package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryNameDropDown {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
	
		// Identifying the country Element 
		// <select size="1" name="country">
		WebElement country=driver.findElement(By.name("country"));
	
	 // Going to country element and getting all the elements in it
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		int Country_count=countryNames.size();
		System.out.println(Country_count);
		
		for(int i=0;i<countryNames.size();i++)
		{
			String countryName=countryNames.get(i).getText();
			System.out.println(i+" "+countryName);
		}
		
		driver.close();

	}

}
