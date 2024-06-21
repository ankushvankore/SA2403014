package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D10POM_Client {
	WebDriver driver;
	RediffCreateAccount r1;
	
	@Test
	public void createAccount() throws InterruptedException
	{
		r1.enterFullName("Ankush Vankore");
		r1.enterRediffId("ankushvankore123");
		r1.checkAvailablity();
		r1.enterPassword("ankush@123");
		r1.confirmPassword("ankush@123");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffCreateAccount(driver);
	}
}
