package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D32MouseClicks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/buttons");
		
		Actions act = new Actions(driver);
		
		WebElement dblClick = driver.findElement(By.id("doubleClickBtn"));
		//act.moveToElement(dblClick).doubleClick().perform();
		act.doubleClick(dblClick).perform();
		System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
		
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		//act.moveToElement(rightClick).contextClick().perform();
		act.contextClick(rightClick).perform();
		System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 255)", "");
		
		WebElement clickBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button"));
		act.moveToElement(clickBtn).click().perform();
		System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
	}

}
