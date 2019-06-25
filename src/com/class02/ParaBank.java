package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Ismail");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.lastName")).sendKeys("KOSEOGLU");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.street")).sendKeys("66 east century rd");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.city")).sendKeys("Paramus");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.state")).sendKeys("New Jersey");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("07652");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("324-43-2345");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.username")).sendKeys("ikoseoglu61");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("i.koseoglu61");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("i.koseoglu61");

        driver.findElement(By.className("button")).click();
	}

}
