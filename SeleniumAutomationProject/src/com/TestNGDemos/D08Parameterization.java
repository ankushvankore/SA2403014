package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class D08Parameterization {
	WebDriver driver;
	
	
	@Parameters({"userName", "password"})
	@Test
	public void login(String un, String ps) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

	@AfterMethod
	public void afterMethod() {
		if(driver.getPageSource().contains("Logged In Successfully"))
			driver.findElement(By.partialLinkText("Log")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
