package com.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrainTracket {

	public static void main(String[] args)
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://ojp.nationalrail.co.uk/service/ldbboard/dep/KGX");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
WebElement table=driver.findElement(By.xpath(".//*[@id='live-departure-board']/div[3]/div[2]"));
		
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
