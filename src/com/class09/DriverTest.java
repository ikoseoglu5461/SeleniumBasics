package com.class09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "src/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}
	

}
