package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D35FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\Flipkart.jpeg");
		
		WebElement terms = driver.findElement(By.id("terms"));
		
		if(terms.isSelected() == false)
			terms.click();
		
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(5000);
		System.out.println("Message: " + driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText());
		
		driver.close();
	}

}
