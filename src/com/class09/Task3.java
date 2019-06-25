package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*TC 3: Verify element is enabled
		 * 1.Open chrome browser
		 * 2.Go to “https://the-internet.herokuapp.com/”
		 * 3.Click on “Click on the “Dynamic Controls” link
		 * 4.Click on enable button
		 * 5.Enter “Hello” and verify text is entered successfully
		 * 6.Close the browser
		 */

		String url = "https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);

		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		
		// 1. Way
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//		
//		String textToEnter="Hello";
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter);
//		String returnedText=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
//		
//		if(returnedText.equals(textToEnter)) {
//			System.out.println("Text is entered");
//		}else {
//			System.out.println("Text "+textToEnter+" is NOT entered");
//		}
		//2. Way
		//identfy the element and then pass it to the exp conditions
		WebElement el=driver.findElement(By.xpath("//input[@type='text']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		
		String textToEnter="Hello";
		el.sendKeys(textToEnter);
		
		String value=el.getAttribute("value");
		System.out.println(value);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
