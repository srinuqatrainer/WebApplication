package com.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Operation {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <iframe class="demo-frame" --- Frame Property of a WebPage
		// Switch to a fram of the Webpage
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));		
		
		// <div id="draggable" -- Drag Element Properties
		WebElement dragElement=driver.findElementById("draggable");
		
		// <div id="droppable" -- Drop Element Properties
		WebElement dropElement=driver.findElementById("droppable");
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(dragElement, dropElement).build().perform();
		
		

	}

}
