package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class iframe2SecondTime extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="http://uitestpractice.com/Students/Switchto";
		setUpDriver("chrome", url);
//		driver.switchTo().frame("iframe_a");
//		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("ismail");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/iframe"));
		driver.switchTo().frame(element);
		
		driver.close();
	}

}
