package ExtraReviewByMySelf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2Task1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.amazon.com");
	
	String title=driver.getTitle();
	if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
		System.out.println("This is the right title");
	}else {
		System.out.println("This is the wrong title");
	}
	driver.quit();
}
}
