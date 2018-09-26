package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Google {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String expected_Title="Google";
		System.out.println("Expected Title of Google is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println("Actual Title of Google is :"+actual_Title);
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("Title Matched -- PASS");
		}
		else
		{
			System.out.println("Title not Matched -- FAIL");
		}
		
		driver.close();

	}

}
