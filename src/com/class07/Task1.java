package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * TC 1: ToolsQA Frame verification Open chrome browser Go to
		 * “https://www.toolsqa.com/iframe-practice-page/” 
		 * Click on “Blogs” link inside first frame 
		 * Verify element “Interactions” is present in second frame 
		 * Navigate to Home Page Quit browser
		 */

		String url = "https://www.toolsqa.com/iframe-practice-page/";
		setUpDriver("chrome", url);
		
		driver.switchTo().frame("iframe1");
		
		driver.findElement(By.linkText("Blogs")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("iframe2");
		Thread.sleep(2000);
		
		WebElement title = driver.findElement(By.xpath("//h3[text()='Interactions']"));
		System.out.println("The title is: " + title.getText());
		
		boolean isDisplayed = title.isDisplayed();
		System.out.println(isDisplayed);
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.quit();

	}

}