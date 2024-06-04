package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByCssSelector_SpecialCharacters {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//$ => Ends with
		WebElement userName = driver.findElement(By.cssSelector("input[data-testid$=\"email\"]"));
		userName.sendKeys("ankushvankore@gmail.com");
		
		//* => Contains
		WebElement password = driver.findElement(By.cssSelector("input[aria-label*=\"sswo\"]"));
		password.sendKeys("12345678");
		
		//^ => Starts with
		WebElement loginBtn = driver.findElement(By.cssSelector("button[id^=\"u_0_5_\"]"));
		loginBtn.click();
	}

}
