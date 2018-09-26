package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 
{

	public class Annotations2 
	{

		@BeforeMethod 
		public void NavigateToApplicationAndLogIn()
		{
			System.out.println(" Navigate To Gmail Application and LogIn ");
		}
		
		
		@Test(priority=0)
		public void inBox()
		{
			System.out.println("Testing Inbox functionality");
		}
		
		@Test(priority=1)
		public void sentMail()
		{
			System.out.println("Testing SentMail Functionality");
		}
		
		
		@AfterMethod
		public void closeApplication()
		{
			System.out.println(" Close Gmail Application");
		}
	
	}	
	
}
