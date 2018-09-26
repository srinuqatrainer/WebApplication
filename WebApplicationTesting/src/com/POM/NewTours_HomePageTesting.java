package com.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_HomePageTesting 
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void HomePage()
	{
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.signOn();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		WMT.register();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		WMT.support();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		WMT.contact();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		WMT.logIn("tutorial", "tutorial");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
			
		
	}
	
}
