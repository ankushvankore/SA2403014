package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D09KeywordDrivenFramework {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;
	
	@Test
	public void login() {
		driver.findElement(By.xpath(prop.getProperty("userNameTxtBoxXpath"))).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.name(prop.getProperty("passwordTxtBoxName"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector(prop.getProperty("submitBtnCss"))).sendKeys(Keys.ENTER);
	}

	@AfterMethod
	public void logout() {
		if(driver.getPageSource().contains("Logged In Successfully"))
			driver.findElement(By.partialLinkText(prop.getProperty("logoutBtnLink"))).click();
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("D:\\StarAgile\\Demos\\SA2403014\\SeleniumAutomationProject\\src\\com\\TestNGDemos\\MyData.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
