package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		String title=driver.getTitle();
		if (title.equalsIgnoreCase("google")) {
			System.out.println("this is right title");
		}else {
			System.out.println("sorry this not the tittle");
		}
	}

}
