package com.CapturingUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl_Facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String url_Facebook=driver.getCurrentUrl();
		System.out.println(url_Facebook);
		
		driver.close();

	}

}
