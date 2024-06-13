package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D28HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		Alert alt;
		
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();			//Will click on Ok button

		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		driver.close();*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		String actualtext = driver.findElement(By.id("confirmResult")).getText();

		System.out.println("Afteraccept :" + actualtext);

		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().dismiss();
		actualtext = driver.findElement(By.id("confirmResult")).getText();

		System.out.println("Aftercancel :" + actualtext);
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("alert is present");

	}

}
