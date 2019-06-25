package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		/*TC 2: Syntax Page URL Verification:
		 * Open chrome browser
		 * Navigate to “https://www.syntaxtechs.com/”
		 * Navigate to “https://www.google.com/”
		 * Navigate back to Syntax Technologies Page
		 * Refresh current page
		 * Verify url contains “Syntax”
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.syntaxtechs.com");
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		String url= "https://syntaxtechs.com//";
	    if (url.contains("syntax")) {
	        System.out.println("Correct");
	    }
	    else {
	        System.out.println("incorrcect");
	    }
	}

}
