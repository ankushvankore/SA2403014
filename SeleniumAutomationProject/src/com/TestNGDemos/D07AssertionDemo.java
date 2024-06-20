package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D07AssertionDemo {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;


	@Test(dataProvider = "getLoginData")		//Read the data from @DataProvider method
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		actUrl = driver.getCurrentUrl();
		
		//Assert.assertEquals(actUrl, expUrl, "Invalid User name or password");
		Assert.assertTrue(actUrl.contains("dash"), "Invalid user name or password");
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "darshan", "darshan123" },
		};
	}

	@AfterMethod
	public void afterMethod() {
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("Test case Pass");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
			driver.findElement(By.partialLinkText("Log")).click();
		}
		else
		{
			System.out.println("Test case fail because of: " + driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
