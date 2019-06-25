package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookXpath {

	public static void main(String[] args) throws InterruptedException {
		/*Using Xpath ONLY
		 * TC 1: Facebook login:
		 * Open chrome browser
		 * Go to “https://www.facebook.com/”
		 * Enter valid username and valid password and click login
		 * User successfully logged in
		 */

		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("xxxxxx@hotmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("xxxxxxxxxxxxxxx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
