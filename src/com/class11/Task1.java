package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		/*TC 1: Upload file and Take Screenshot
		 * Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
		 * Upload file
		 * Verify file got successfully uploaded and take screenshot
		 */
		try {
		setUpDriver("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
		
		String filePath = "C:\\Users\\ikoseoglu61\\Desktop\\GoToWebinar 004.PNG";
		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);
		
		driver.findElement(By.xpath("//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div/table/tbody/tr[4]/td/button")).click();
		

		Alert alert=driver.switchTo().alert();
		
		if(alert.getText().equals("File uploaded!")) {
			System.out.println("File uploaded succesfully");
		
		}else {
			System.out.println("File did NOT upload succesfully");
		}
		alert.accept();
		
		
		TakesScreenshot camera=(TakesScreenshot)driver;
		File pic=camera.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(pic, new File("screenshots/Tasks/Task1.jpg"));
		
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Selfie not taken");
		
		}finally{driver.quit();

	}
}
}