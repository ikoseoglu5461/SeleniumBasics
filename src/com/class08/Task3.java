package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*Ahead to http://uitestpractice.com/Students/Index
		 * Click on the Actions
		 * Click and hold on 1,2,3,4 boxes
		 * Close the browser
		 */

		String url="http://uitestpractice.com/Students/Index";
		setUpDriver("chrome", url);
		
		driver.findElement(By.linkText("Actions")).click();
		
		//chosee drag and drop location in cssselector
		WebElement drag=driver.findElement(By.cssSelector("#selectable > li:nth-child(1)"));
		WebElement drop=driver.findElement(By.cssSelector("#selectable > li:nth-child(4)"));
		//create action method with driver
		Actions action=new Actions(driver);
		//start with first location and end loction and comfirm it
		action.clickAndHold(drag).perform();
		action.moveToElement(drop).perform();
		action.release(drop).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
