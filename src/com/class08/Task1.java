package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*Task One
		 * Ahead to http://uitestpractice.com/Students/Index
		 * Click on the Actions
		 * Click on the click me !
		 * Handle the alert and click okay
		 * Double Click Double Click Me !
		 * Handle the alert and click okay
		 * Close the browser
		 */

		String url="http://uitestpractice.com/Students/Index";
		setUpDriver("chrome", url);
		//going to Actions link
		driver.findElement(By.linkText("Actions")).click();
		// click on Click me!
		driver.findElement(By.cssSelector("body > div.container.body-content > div:nth-child(1) > div:nth-child(4) > button:nth-child(1)")).click();
		Thread.sleep(3000);
		//Handling alert OK!
		Alert alertOne=driver.switchTo().alert();
		alertOne.accept();
		Thread.sleep(3000);
		// Double Click
		Actions action=new Actions(driver);
		action.doubleClick(driver.findElement(By.cssSelector("body > div.container.body-content > div:nth-child(1) > div:nth-child(4) > button:nth-child(2)"))).perform();
		Thread.sleep(3000);
		//Handling double click alert OK!
		Alert alertTwo=driver.switchTo().alert();
		alertTwo.accept();
		Thread.sleep(3000);
		driver.close();
	}

}
