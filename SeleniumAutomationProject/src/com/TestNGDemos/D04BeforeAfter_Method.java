package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04BeforeAfter_Method {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Test");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("After Test");
		driver.close();
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void displayTitle()
	{
		System.out.println("Title: " + driver.getTitle());
		System.out.println("After Method");
	}
	

	@Test(priority = 1)
	public void openMeesho() {
		driver.get("https://www.meesho.com/");
	}

	@Test(priority = 3)
	public void openFlipkart() {
		driver.get("https://www.flipkart.com/");
	}

	@Test(priority = 2)
	public void openMyntra() {
		driver.get("https://www.myntra.com/");
	}

	@Test(priority = 4)
	public void openDecathlon() {
		driver.get("https://www.decathlon.in/");
	}
}
