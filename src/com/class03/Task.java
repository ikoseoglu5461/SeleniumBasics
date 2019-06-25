package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		/*Open chrome browser
		 * Go to “http://newtours.demoaut.com/”
		 * Click on Register Link
		 * Fill out all required info
		 * Click Submit
		 * User successfully registered
		 * (Create 2 scripts using different locators)
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Ismail");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("KOSEOGLU");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("ikoseoglu61@hotmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("66 east century rd");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Paramus");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("New Jersey");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("07652");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("ikoseoglu61@hotmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("i.koseoglu61");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("i.koseoglu61");
        driver.findElement(By.name("register")).click();
        driver.close();

		
	}

}
