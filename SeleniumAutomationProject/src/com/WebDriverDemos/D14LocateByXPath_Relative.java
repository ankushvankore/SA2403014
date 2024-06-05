package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D14LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		/*driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//form[@class=\"_9vtf\"]/div/div/input")).sendKeys("ankushvankore@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		*/
		driver.get("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropable = driver.findElement(By.xpath("//div[@id='draggable']/ancestor::div[2]/div/div[2]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, dropable).build().perform();
		System.out.println("hi");

	}

}
