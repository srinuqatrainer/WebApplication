package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
// <a class="gb_P" href="https://mail.google.com/mail/?tab=wm" data-pid="23">Gmail</a>
		// class - Locator -- className
		
		driver.findElement(By.className("gb_P")).click();
		
		System.out.println(driver.getTitle());
		
		

	}

}
