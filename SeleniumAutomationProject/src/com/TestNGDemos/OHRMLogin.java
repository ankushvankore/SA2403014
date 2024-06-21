package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRMLogin {
	WebDriver driver;
	
	public OHRMLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String un)
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	}
	public void enterPassword(String ps)
	{
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	}
	public void clickOnLogin()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	public void logout()
	{
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("Test case Pass");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
			driver.findElement(By.partialLinkText("Log")).click();
		}
		else
		{
			System.out.println("Test case fail because of: " + driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
		}
	}

}
