package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowserAutomation {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\GayatriSelenium\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		// Edge Browser
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\srinivas1\\Desktop\\GayatriSelenium\\WebApplicationTesting\\DriverFiles\\MicrosoftWebDriver.exe");
		
		EdgeDriver drive = new EdgeDriver();
		drive.get("http://facebook.com");
		
		// Older version of Internet Explorer Browser
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\srinivas1\\Desktop\\GayatriSelenium\\WebApplicationTesting\\DriverFiles\\IEDriverServer.exe");
		
		InternetExplorerDriver dr = new InternetExplorerDriver();
		dr.get("http://yahoo.com");

		// firefox browser verison above 50.0 and Selenium server above 3.0 
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\srinivas1\\Desktop\\GayatriSelenium\\WebApplicationTesting\\DriverFiles\\geckodriver.exe");
		
		FirefoxDriver dri = new FirefoxDriver();
		dri.get("http://gmail.com"); 
		
	}

}
