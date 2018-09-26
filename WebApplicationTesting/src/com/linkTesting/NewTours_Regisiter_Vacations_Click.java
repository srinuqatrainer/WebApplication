package com.linkTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Regisiter_Vacations_Click {

	public static void main(String[] args)
	{
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	/*	<a href="mercuryregister.php">REGISTER</a>

		 a - tag - anchor tag
		 href - Attribute

		 Then that element is of type "Link"
		 
		 locator - linkText
		 selector - REGISTER */
		
		driver.findElement(By.linkText("REGISTER")).click();

		// <a href="mercuryunderconst.php">Vacations</a>
		
		driver.findElement(By.linkText("Vacations")).click();


	}

}
