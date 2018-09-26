package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1
{

	@Test(priority=0) // it represents to a Test case
	// creating a Method
	public void OpenBrowser()
	{
		System.out.println(" Open FireFox Browser ");
	}
	
	@Test(priority=1)
	public void NavigateToGmail()
	{
		System.out.println(" Navigated to Gmail Application ");
	}
	
	@Test(enabled=false)
	public void LogIn()
	{
	
		System.out.println("LogIn to Gmail Application");
	}
	
	
	
}
