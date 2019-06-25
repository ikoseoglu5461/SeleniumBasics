package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		/*TC 2: Swag Labs Negative login:
		 * Open chrome browser
		 * Go to “https://www.saucedemo.com/”
		 * Enter invalid username and password and click login
		 * Verify error message contains: “Username and password do not match any user in this service”
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61//Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_uuser");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_ssauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);

		boolean isDisplayed=driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();
		if (isDisplayed) {
			System.out.println("Error notification showed");
		}else {
			System.out.println("Error notification did NOt show");
		}
		driver.close();
	}

}
