package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		/*TC 1: Amazon Department List Verification
		 * Open chrome browser
		 * Go to “http://amazon.com/”
		 * Verify how many department options available.
		 * Print each department
		 * Select Computers
		 * Quit browser 
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://amazon.com/");
		
		WebElement departments = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		Select select = new Select(departments);
		List<WebElement> allOptions=select.getOptions();
		System.out.println("All options are="+allOptions.size());
		
		System.out.println("------ all options from departments dd-------");
		Iterator<WebElement> it=allOptions.iterator();
		while(it.hasNext()) {
			String departmentsText=it.next().getText();
			System.out.println(departmentsText);
		}
		select.selectByVisibleText("Computers");
		Thread.sleep(3000);
		driver.quit();
	}
		
}
