package com.ValidatingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingUrl_And_Title_Facebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String expected_Url="facebook.com";
		System.out.println("Expected Url of FaceBook is: "+expected_Url);
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println("Actual Url of Facebook is "+actual_Url);
		
		if(actual_Url.contains(expected_Url))
		{
			System.out.println("Url matched - PASS");
		}
		else
		{
			System.out.println("Url not matched - FAIL");
		}
		
		System.out.println();
		
		String expected_Title="Facebook";
		System.out.println("Expected Title of Facebook is: "+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println("Actual title of Facebook is:  "+ actual_Title);
		
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("Title matched - PASS");
		}
		else
		{
			System.out.println("Title not matched - FAIL");
		}
		driver.close();

	}

}
