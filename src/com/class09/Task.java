package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*TC 1: Verify element is present
		 * Open chrome browser
		 * Go to “https://the-internet.herokuapp.com/”
		 * Click on “Click on the “Dynamic Loading” link
		 * Click on “Example 1...” and click on “Start”
		 * Verify element with text “Hello World!” is displayed
		 * Close the browser
		 */
		
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#finish>h4")));

		WebElement el = driver.findElement(By.cssSelector("#finish>h4"));

		boolean flag = driver.findElement(By.cssSelector("#finish>h4")).isDisplayed();

		if (el.isDisplayed()) {
			String text = el.getText();
			System.out.println(text);
		} else {
			System.out.println("Element is not displayed");
		}
		driver.quit();
	}

}
