package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsStartsWithFaceBook {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("xxxxxx@hotmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).sendKeys("xxxxxxxxxxxxxxx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_2')]")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
