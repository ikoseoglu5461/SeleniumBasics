package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class FileUpLoad extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("File Upload")).click();

		String filePath = "C:\\Users\\ikoseoglu61\\Desktop\\GoToWebinar 004.PNG";
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		
		driver.findElement(By.id("file-submit")).click();

		boolean isDisplayed = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).isDisplayed();

		if (isDisplayed) {
			System.out.println("File uploaded succesfully");

		} else {
			System.out.println("File did NOT upload succesfully");
		}
		TakesScreenshot ts= (TakesScreenshot)driver;
		File picture=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(picture, new File ("screenshots/Google/GooglePage.PNG"));
			}catch (IOException e) {
				e.printStackTrace();
				System.out.println("Selfie not taken");
		Thread.sleep(2000);
		driver.quit();
	}

	}
}
