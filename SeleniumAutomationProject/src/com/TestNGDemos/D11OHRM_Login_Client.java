package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D11OHRM_Login_Client {
	WebDriver driver;
	OHRMLogin l1;
	
	@Test
	public void f() {
		l1.enterUserName("admin");
		l1.enterPassword("admin123");
		l1.clickOnLogin();
		l1.logout();
	}
	
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		l1 = new OHRMLogin(driver);
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
}
