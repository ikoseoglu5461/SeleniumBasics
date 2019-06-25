package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class ProjectTask1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Users Application Form Fill 1.Open chrome browser 2.Go to
		 * “http://uitestpractice.com/” 3.Click on “Forms” link 4.Fill out the entire
		 * form 5.Close the browser MUST USE Functions:
		 */

		String url = "http://uitestpractice.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Form")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Ismail");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Koseoglu");
		Thread.sleep(2000);

		WebElement martialStatus = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[2]/input"));
		martialStatus.click();
		Thread.sleep(2000);

		WebElement hobby = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[3]/input"));
		hobby.click();
		Thread.sleep(2000);

		WebElement countries = driver.findElement(By.xpath("//*[@id=\"sel1\"]"));
		Select obj = new Select(countries);
		obj.selectByVisibleText("Canada");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();

		WebElement year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));

		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1989");
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));

		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Jun");
		Thread.sleep(2000);

		
		String expectedDate = "1";
		List<WebElement> cells = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
		for (WebElement cell : cells) {

			String cellText = cell.getText();
			if (cellText.equals(expectedDate)) {
				cell.click();
			}
		}
		sendText(driver.findElement(By.xpath("//*[@id=\"phonenumber\"]")), "123456789");
		Thread.sleep(1000);
		sendText(driver.findElement(By.xpath("//*[@id=\"username\"]")), "Ali");
		Thread.sleep(1000);
		sendText(driver.findElement(By.xpath("//*[@id=\"email\"]")), "aliali@gmail.com");
		Thread.sleep(1000);
		sendText(driver.findElement(By.xpath("//*[@id=\"comment\"]")), "I am perfect");
		Thread.sleep(1000);
		sendText(driver.findElement(By.xpath("//*[@id=\"pwd\"]")), "864651651ddww");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[12]/div/button")).click();

		driver.close();
	}
}
