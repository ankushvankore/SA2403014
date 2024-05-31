package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D05GetPageSource {

	public static void main(String[] args) {
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * 
		 * driver.get("https://www.selenium.dev/downloads/");
		 * 
		 * String source = driver.getPageSource(); System.out.println(source);
		 * driver.close();
		 */

		WebDriver driver1 = new EdgeDriver();
		WebDriver driver2 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver2.manage().window().maximize();

		driver1.get("https://www.google.co.in/");
		driver2.get("https://www.selenium.dev/downloads/");

		String title1 = driver1.getTitle();
		String title2 = driver2.getTitle();
		System.out.println("Title1: " + title1);

		System.out.println("Title2: " + title2);
		driver1.close();
		driver2.close();

	}

}
