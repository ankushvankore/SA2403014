package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D36DragAndDrop2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/slider/");
		
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(0);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		act.dragAndDropBy(element, element.getLocation().x+20, element.getLocation().y).perform();
	}

}
