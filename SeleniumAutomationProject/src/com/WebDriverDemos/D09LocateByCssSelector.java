package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		userName.sendKeys("myemail@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[aria-label=\"Password\"]"));
		password.sendKeys("mypassword");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[value=\"1\"][name=\"login\"]"));
		loginBtn.click();
	}

}
