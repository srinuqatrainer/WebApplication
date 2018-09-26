package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{

	@BeforeTest // it always runs before the Test case
	public void NavigateToApplication()
	{
		System.out.println(" Navigate To Gmail Application ");
	}
	
	@Test(priority=0)
	public void logIn()
	{
		System.out.println("LogIn to Gmail");
	}
	
	@Test(priority=1)
	public void inBox()
	{
		System.out.println("Testing Inbox functionality");
	}
	
	@AfterTest // this is executed after all the Test cases
	public void closeApplication()
	{
		System.out.println(" Close Gmail Application");
	}

}
