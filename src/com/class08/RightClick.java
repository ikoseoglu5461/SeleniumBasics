package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class RightClick extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// Task for contextClick
		// Navigate to https://www.saucedemo.com
		// Right click on the username textbox 
		// Close the browser 
		
		setUpDriver("chrome", "https://www.saucedemo.com/");
		//Right click on the username textbox 
		WebElement rightClick=driver.findElement(By.cssSelector("input#user-name"));
		Actions action=new Actions(driver);
		action.contextClick(rightClick).perform();
		Thread.sleep(2000);
		//Right click on the password textbox 
		WebElement rightClick1=driver.findElement(By.cssSelector("input#password"));
		Actions action1=new Actions(driver);
		action1.contextClick(rightClick1).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
