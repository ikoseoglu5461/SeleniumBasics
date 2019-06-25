package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*Ahead to http://uitestpractice.com/Students/Index
		 * Click on the Actions
		 * Handle the drag and drop
		 * Close the browser
		 */
		String url="http://uitestpractice.com/Students/Index";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Actions")).click();
		
		WebElement drag=driver.findElement(By.cssSelector("#draggable"));
		WebElement drop=driver.findElement(By.cssSelector("#droppable"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();
//		action.clickAndHold(drag).perform();
//		action.moveToElement(drop).perform();
//		action.release(drop).perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
