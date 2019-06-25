package com.class05;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonListCount {

	public static void main(String[] args) {
		/*
		 * Open chrome browser Go to “https://www.amazon.com/” Using Iterator get text
		 * of each link Get number of links that has text
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61//Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: " + links.size());
		
		Iterator<WebElement> it=links.iterator();
		int count = 0;
		while (it.hasNext()) {
			WebElement link = it.next();
			String linkText = link.getText();

			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
				System.out.println("Total number of links with text: " + count);
				
			}

		}
		driver.quit();
	}
}
