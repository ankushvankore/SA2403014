package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03GoogleSignin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		/*driver.findElement(By.partialLinkText("Gm")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("identifier")).sendKeys("mymailid@gmail.com");
		*/
		
		driver.findElement(By.tagName("button")).click();

	}

}
