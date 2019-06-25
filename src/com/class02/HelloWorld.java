package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("Webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.get("https://www.amazon.com");
//		
		System.setProperty("Webdriver.gecko.driver", "/Users/ikoseoglu61/Selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
	}

}
