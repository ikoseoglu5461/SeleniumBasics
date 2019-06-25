package com.class07;

import utils.CommonMethods;

public class test extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("firefox", "https://www.google.com/");
		Thread.sleep(3000);
		driver.close();
		
	

	}

}
