package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours
{

	/*WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
	signOn.click();*/
	
	@FindBy(linkText="SIGN-ON")
	WebElement SignOn;
	
	public void signOn()
	{
		SignOn.click();
	}
	
	
	@FindBy(linkText="REGISTER")
	WebElement Register;
	
	public void register()
	{
		Register.click();
	}
		
	@FindBy(linkText="SUPPORT")
	WebElement Support;
	
	public void support()
	{
		Support.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement Contact;
	
	public void contact()
	{
		Contact.click();
	}
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void logIn(String UName,String Pwd)
	{
		UserName.sendKeys(UName);
		Password.sendKeys(Pwd);
		SignIn.click();
	}
	
}
