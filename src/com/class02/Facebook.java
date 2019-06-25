package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		
		String title=driver.getTitle();
		if (title.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("This is right title");
		}else {
			System.out.println("Sorry this not the tittle");
		}
	}

}
	
