package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11LocateByLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		/*String text = gmailLink.getText();
		System.out.println("Text on the link: " + text);
		String url = gmailLink.getAttribute("href");
		System.out.println("URL of this link: " + url);
		*/
		
		System.out.println("Text on this link: " + gmailLink.getText());
		System.out.println("URL for this link: " + gmailLink.getAttribute("href"));
		
		/*String text = driver.findElement(By.linkText("Gmail")).getText();
		String url = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println("Text on the link: " + text);
		System.out.println("URL of this link: " + url);
		*/
		gmailLink.click();
		
	}

}
