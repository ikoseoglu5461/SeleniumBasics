package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61//Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement continentDD=driver.findElement(By.id("continents"));
		
		Select obj=new Select(continentDD); //Secim yapilmasi gereken yerlerde bu sekilde kullaniliyor, Aylar, ulkeler gibi
		//select value by index
		obj.deselectByIndex(3);// Australia
		//select by visibleText
		obj.deselectByVisibleText("North America");
		//select by value
		obj.deselectByValue("Asia");
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
