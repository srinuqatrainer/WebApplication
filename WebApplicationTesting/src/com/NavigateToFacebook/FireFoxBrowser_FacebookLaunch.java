package com.NavigateToFacebook;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_FacebookLaunch {

	public static void main(String[] args)
	{
		// Open FireFox Browser
		FirefoxDriver gayatri = new FirefoxDriver();
		gayatri.get("http://facebook.com");
		
		gayatri.navigate().to("http://google.com");
		
		gayatri.close();

	}

}
