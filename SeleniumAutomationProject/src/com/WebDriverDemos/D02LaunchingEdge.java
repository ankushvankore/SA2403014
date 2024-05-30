package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D02LaunchingEdge {

	public static void main(String[] args) {
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		driver.close();
	}

}
