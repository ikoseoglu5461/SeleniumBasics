package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class iframe extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		driver.switchTo().frame("iframe_a");
		Thread.sleep(2000);
		//way 1:name
		driver.switchTo().frame("iframe_a");
		//way 2:webelement
		WebElement element=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(element);
		//way 3:index
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("ismail");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}

}
