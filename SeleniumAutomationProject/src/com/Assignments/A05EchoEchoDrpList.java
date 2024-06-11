package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A05EchoEchoDrpList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms11.htm");
		
		/*driver.findElement(By.linkText("Tutorials")).click();
		driver.findElement(By.linkText("HTML")).click();
		driver.findElement(By.linkText("HTML FORMS")).click();
		driver.findElement(By.partialLinkText("DROP")).click();
		*/
		
		//WebElement drpList = driver.findElement(By.name("mydropdown"));
		//Select milkProducts = new Select(drpList);
		/*Select milkProducts = new Select(driver.findElement(By.name("mydropdown")));
		
		System.out.println("Selected Item: " + milkProducts.getFirstSelectedOption().getText());
		
		//milkProducts.selectByVisibleText("Old Cheese");
		//milkProducts.selectByIndex(1);
		milkProducts.selectByValue("Bread");
		System.out.println("Selected Item: " + milkProducts.getFirstSelectedOption().getText());
		*/
		new Select(driver.findElement(By.name("mydropdown"))).selectByIndex(1);
	}

}
