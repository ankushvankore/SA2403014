package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Money")).click();
		driver.findElement(By.partialLinkText("More")).click();
		
		//List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		List<WebElement>headers = driver.findElements(By.tagName("th"));
		
		for(WebElement h : headers)
			System.out.println(h.getText());
		
		List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total Rows: " + rows.size());
		
		Random rnd = new Random();
		//int n = rnd.nextInt(11);		//Returns any random value in the range of 0 to 10
		int n = rnd.nextInt(rows.size());//
		System.out.println(n);
		
		System.out.println(rows.get(n).getText());
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (n+1) + "]")).getText());
		
		driver.close();
	}

}
