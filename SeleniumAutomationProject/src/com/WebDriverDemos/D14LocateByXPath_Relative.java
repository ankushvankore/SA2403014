package com.WebDriverDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//form[@class=\"_9vtf\"]/div/div/input")).sendKeys("ankushvankore@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}

}
