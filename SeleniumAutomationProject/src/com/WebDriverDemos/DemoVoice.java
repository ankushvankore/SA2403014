package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemoVoice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://webflow.com/made-in-webflow");

		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByIndex(1);
		new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByIndex(5);
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[4]")).click();
		//driver.findElement(By.id("dateOfBirthInput")).sendKeys("29 Jan 1979");
		*/
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/nav/div/div/div/div/div[3]/button")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/nav/div/div/div/div/div[4]/div[4]/a/div/div")).getText());
		
		driver.close();
	}

}
