package com.TestNGDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RediffCreateAccount {
	WebDriver driver;
	
	public RediffCreateAccount(WebDriver d)
	{
		driver = d;
	}
	
	public void enterFullName(String name)
	{
		driver.findElement(By.cssSelector("input[name^=\"name\"]")).sendKeys(name);
	}

	public void enterRediffId(String id)
	{
		driver.findElement(By.cssSelector("input[name^=\"login\"]")).sendKeys(id);
	}
	public void checkAvailablity() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font/b")).getText());
	}
	public void enterPassword(String ps)
	{
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(ps);
	}
	public void confirmPassword(String ps)
	{
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(ps);
	}
}
