package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		/*TC 2: Select and Deselect values
		 * Open chrome browser
		 * Go to “http://uitestpractice.com/”
		 * Click on “Select” tab
		 * Verify how many options available in the first drop down and then select “United states of America”
		 * Verify how many options available in the second drop down and then select all.
		 * Deselect China from the second drop down
		 * 
		 * Quit browser
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Select")).click();
		//Working with Single DD
		
		WebElement countriesDD = driver.findElement(By.id("countriesSingle"));
		
		CommonMethods.selectValueFromDD(countriesDD, "United States of America");
		Select select = new Select(countriesDD);
		int ddSize=select.getOptions().size();
		System.out.println("All options in Single countries ="+ddSize);
		select.selectByVisibleText("United states of America");
		Thread.sleep(3000);
		
		//Working with multiple DD
		
		WebElement multiDD = driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select select1 = new Select(multiDD);
		List<WebElement> optionList=select.getOptions();
		ddSize=select.getOptions().size();
		System.out.println("All options in Multiple countries="+ddSize);
		
		//check if we can select multiple options
		if (select.isMultiple()) {
			for (int i=0; i<ddSize; i++) {
				select.selectByIndex(i);
				Thread.sleep(1000);
				}
			//another way
			for (WebElement option:optionList ) {
				option.click();
				Thread.sleep(2000);
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
