package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D16LocateByRelativeLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass"))).sendKeys("test@gmail.com");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("email"))).sendKeys("122333");
		driver.findElement(RelativeLocator.with(By.tagName("button")).above(By.linkText("Forgotten password?"))).click();
		
	}

}
