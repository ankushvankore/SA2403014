package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01EchotrakAssignment {

	public static void main(String[] args) {
		String expMsg = "Invalid Username/Password";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		/*WebElement userId = driver.findElement(By.id("txtCustomerID"));
		userId.sendKeys("Sunil");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("sunil123");
		*/
		
		WebElement userId = driver.findElement(By.className("form-control"));
		userId.sendKeys("Anitha");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("anitha123");
		
		WebElement loginBtn = driver.findElement(By.id("Butsub"));
		loginBtn.click();
		
		WebElement error = driver.findElement(By.className("error"));
		String errMsg = error.getText();
		System.out.println("Error Message: " + errMsg);
		
		//if(expMsg.equals(errMsg))
		if(errMsg.contains("Invalid"))
			System.out.println("Correct Error Message: Test case pass");
		else
			System.out.println("Invalid Error Message: Test case fail");
		
		driver.close();
	}

}
