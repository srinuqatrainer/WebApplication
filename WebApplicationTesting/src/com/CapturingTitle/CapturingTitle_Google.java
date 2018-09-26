package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_Google {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		// Identifying the title of Application(driver) and save into a Variable(actual_Title)
		String actual_Title=driver.getTitle();
		
		// Printing out the Variable(actual_Title) in which the title of an Application is saved
		System.out.println(actual_Title);
		
		driver.close();
		
		
		

	}

}
