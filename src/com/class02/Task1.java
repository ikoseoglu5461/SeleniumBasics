package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		/*TC 1: Amazon Page Title Verification:
		 * Open chrome browser
		 * Go to “https://www.amazon.com/”
		 * Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” 
		 * is displayed 
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.amazon.com");
		
		String title=driver.getTitle();
		if (title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This is right title");
		}else {
			System.out.println("Sorry this not the tittle");
		}
	}

}
