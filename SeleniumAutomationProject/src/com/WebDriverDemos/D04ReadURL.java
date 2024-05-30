package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04ReadURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("downloads"))
			System.out.println("Test case Pass :)");
		else
			System.out.println("Test case Fail :(");
	}

}
