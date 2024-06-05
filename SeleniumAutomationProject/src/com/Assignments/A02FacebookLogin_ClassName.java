package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02FacebookLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userId = driver.findElement(By.className("_6luy"));
		userId.sendKeys("ankushvankore@gmail.com");
		WebElement password = driver.findElement(By.className("_9npi"));
		password.sendKeys("123456");
		WebElement loginBtn = driver.findElement(By.className("_42ft"));
		loginBtn.click();
		
		driver.close();
	}

}
