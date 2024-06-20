package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05AmazonAssignment {
	WebDriver driver;

	@Test (priority = 1, groups = "Seller")
	public void clickOnSell() {
		driver.findElement(By.partialLinkText("Sell")).click();
	}
	@Test (priority = 2, groups = "Seller")
	public void clickOnBestSeller() {
		driver.findElement(By.partialLinkText("Best")).click();
	}
	@Test (priority = 3, groups = "Gadgets")
	public void clickOnMobile() {
		driver.findElement(By.partialLinkText("Mobile")).click();
	}
	@Test (priority = 4, groups = "Gadgets")
	public void clickOnElectronics() {
		driver.findElement(By.partialLinkText("Electr")).click();
	}

	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.close();
	}

}
