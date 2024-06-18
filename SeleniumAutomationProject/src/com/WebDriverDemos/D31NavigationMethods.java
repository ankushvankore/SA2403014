package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D31NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Sell")).click();
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
