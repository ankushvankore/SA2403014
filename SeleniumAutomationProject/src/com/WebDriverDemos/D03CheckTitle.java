package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03CheckTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		if(title.equals("Selenium"))
			System.out.println("Title Matching!!!\nTest Case Pass :)");
		else
			System.out.println("Title not Matching!!!\nTest Case Fail :(");
		
		driver.close();
	}

}
