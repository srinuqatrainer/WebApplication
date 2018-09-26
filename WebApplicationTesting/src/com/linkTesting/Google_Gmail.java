package com.linkTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail {

	public static void main(String[] args)
	{
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
// <a class="gb_P" href="https://mail.google.com/mail/?tab=wm" data-pid="23">Gmail</a>
		
		//driver.findElement(By.className("gb_P")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		
// <a id="gb_70" class="gb_se gb_Aa gb_Eb" target="_top" 
//		href="https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/">Sign in</a>
		
		driver.findElement(By.linkText("Sign in")).click();
		

	}

}
