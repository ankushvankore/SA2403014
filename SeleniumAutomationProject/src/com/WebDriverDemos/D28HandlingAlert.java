package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D28HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		Alert alt;
		JavascriptExecutor js;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		
		js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0, 250)", "");
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();			//Will click on Ok button

		js.executeScript("arguments[0].click()", driver.findElement(By.id("timerAlertButton")));
		Thread.sleep(5000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("confirmButton")));
		alt = driver.switchTo().alert();
		alt.dismiss();			//Will click on Cancel button
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		alt = driver.switchTo().alert();
		alt.sendKeys("Kavita");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		driver.close();
	}

}
