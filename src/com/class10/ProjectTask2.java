package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class ProjectTask2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*TC 1: Table headers and rows verification
		 * 1.Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		 * 2.Login to the application
		 * 3.Create an Order
		 * 4.Verify order of that person is displayed in the table “List of All Orders”
		 * 5.Click on edit of that specific order
		 * 6.Verify each order details
		 * 7.Update street address
		 * 8.Verify in the table that street has been updated
		 * 9.Close browser
		 */
		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")), "Tester");
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")), "test");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Order")).click();
		Thread.sleep(2000);
		
		WebElement product=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]"));
		Select select=new Select(product);
		select.selectByVisibleText("FamilyAlbum");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]")).sendKeys("5");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtUnitPrice\"]")).sendKeys("50");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtDiscount\"]")).sendKeys("25");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")).sendKeys("ismail koseoglu");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]")).sendKeys("23 abc rd ");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]")).sendKeys("Paramus");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]")).sendKeys("New Jersey");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]")).sendKeys("07652");
		
		WebElement cardType = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList_1\"]"));
		cardType.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("5678234567891234");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]")).sendKeys("01/23");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[1]/a")).click();
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));

		// Click on the checkbox next to "Ismail Koseoglu"
		String expectedValue = "ismail koseoglu";

		for (int i = 2; i <= cols.size(); i++) {
			String colText = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr["+i+"]")).getText();

			if (colText.contains(expectedValue)) {
				
				System.out.println(expectedValue+" Is present");
				break;
		
			}else {
				System.out.println(expectedValue+" Is not present");
		}
		
	}
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[13]/input")).click();
		Thread.sleep(2000);
		
		
		//driver.close();
}
}

