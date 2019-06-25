package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kimya_ci61@hotmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("12611884146");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		
	}

}
