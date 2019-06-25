package ExtraReviewByMySelf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2Task2 {

	public static void main(String[] args) {
		/*1.Open chrome browser
		 * 2.Navigate to “https://www.syntaxtechs.com/”
		 * 3.Navigate to “https://www.google.com/”
		 * 4.Navigate back to Syntax Technologies Page
		 * 5.Refresh current page
		 * 6.Verify url contains “Syntax”
		 */
		System.setProperty("webdriver.chrome.driver", "/Users/ikoseoglu61/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.syntaxtechs.com/");
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String url="https://www.syntaxtechs.com/";
		if(url.contains("syntax")) {
			System.out.println("This is the right title");
		}else {
			System.out.println("This is the wrong title");
		}
		driver.quit();
	}
	}


