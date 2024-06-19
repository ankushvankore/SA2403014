package com.Assignments;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A09OHRM_LoginLogout {
	WebDriver driver;

	@Test
	public void login1() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@Test
	public void login2() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("kavita");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("kavita123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@Test
	public void login3() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("poonam");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("poonam123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@AfterMethod
	public void afterMethod() {
		if(driver.getCurrentUrl().contains("dash"))
		{
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
			driver.findElement(By.partialLinkText("Log")).click();
		}
		else
		{
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
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
