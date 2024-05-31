package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.name("email"));
		//Please find a control whose name is email and store that control
		//in userName object
		userName.sendKeys("ankushvankore@gmail.com");
		//sendKeys() => Will enter text in the textbox
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345678");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
	}

}
