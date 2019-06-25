package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsWithTextNewTours {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("Ismail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("KOSEOGLU");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("ikoseoglu61@hotmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'address1')]")).sendKeys("66 east century rd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("Paramus");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'state')]")).sendKeys("New Jersey");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'postalCode')]")).sendKeys("07652");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("ikoseoglu61@hotmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("i.koseoglu61");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'confirmPassword')]")).sendKeys("i.koseoglu61");
        driver.findElement(By.xpath("//input[contains(@name,'register')]")).click();
        driver.close();

	}

}
