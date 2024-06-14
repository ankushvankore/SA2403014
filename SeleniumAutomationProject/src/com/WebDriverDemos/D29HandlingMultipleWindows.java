package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D29HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.online.citibank.co.in/");
		
		//Close button on 1st ad
		driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a")).click();
		//Close button on 2nd ad
		driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"loginId\"]/img")).click();	//Login Now button
		
		System.out.println("Title: " + driver.getTitle());
		
		Set<String> windows = driver.getWindowHandles();
		//System.out.println(windows);
		Iterator<String>itr = windows.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		//System.out.println(win1);
		//System.out.println(win2);
		
		driver.switchTo().window(win2);	//Switch to the next browser window
		System.out.println("Title: " + driver.getTitle());
		
		//Enter text in user id textbox
		driver.findElement(By.name("User_Id")).sendKeys("12345678");
		Thread.sleep(2000);
		
		driver.switchTo().window(win1);
		
		//Click on Apply now
		driver.findElement(By.xpath("//*[@id=\"applylist\"]/span")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
