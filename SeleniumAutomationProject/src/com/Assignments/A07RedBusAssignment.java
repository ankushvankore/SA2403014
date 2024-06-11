package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A07RedBusAssignment {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		//Source
		driver.findElement(By.id("src")).sendKeys("Kolh");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		
		//Destination
		driver.findElement(By.id("dest")).sendKeys("Bang");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		
		//Date
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[7]/span[1]")).click();
		
		//Search Bus
		driver.findElement(By.id("search_button")).click();
		
		//Result
		System.out.println(driver.findElement(By.xpath("//*[@id=\"17573072\"]/div/div[2]/div[1]/div[1]/div[1]")).getText());
		
		driver.close();
	}

}
