package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class TaskWindows extends CommonMethods {

	public static void main(String[] args) {
		/*Ahead to http://uitestpractice.com/Students/Switchto
		 * Get the parent title
		 * Get the parentId
		 * print the parent title and parentId
		 * Click on the open in a new window
		 * Get the child title
		 * Get the childId
		 * print the child title and childId
		 * close the child window
		 */
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String parent=driver.getTitle();
		String parentId=driver.getWindowHandle();
		System.out.println("title:"+parent+" "+" ID:"+parentId);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/a")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> it=allWindows.iterator();
		parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		
		child=driver.getTitle();
		String childId=driver.getWindowHandle();
		
		System.out.println("title:"+child+" "+" ID:"+childId);
		
		driver.switchTo().window(parent);
		driver.close();
	}

}
