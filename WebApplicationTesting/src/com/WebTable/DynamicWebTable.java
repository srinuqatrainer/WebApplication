package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// identifying the table in the webPage
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[1]/div/section/div[1]/div/table"));
		
		List<WebElement>Rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<Rows.size();i++) // Going to every Row of the table
		{
			List<WebElement>Cols=Rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<Cols.size();j++) // goes to every Row of all the Columns
			{
				String data=Cols.get(j).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
		driver.close();
		
	}

}
