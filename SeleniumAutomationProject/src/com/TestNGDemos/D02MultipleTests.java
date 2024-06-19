package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {
	@Test (priority = 1)
	public void openMeesho() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.meesho.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	
	@Test (priority = 3)
	public void openFlipkart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	
	@Test (priority = 2)
	public void openMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	
	@Test (priority = 4)
	public void openDecathlon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.decathlon.in/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
}
