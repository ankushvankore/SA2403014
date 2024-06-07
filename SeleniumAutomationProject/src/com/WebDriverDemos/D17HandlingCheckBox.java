package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement chkBox = driver.findElement(By.cssSelector("input[name^=\"chk_alt\"]"));
		
		System.out.println("Before Clicking...");
		System.out.println("Selected: " + chkBox.isSelected());
		System.out.println("Enabled : " + chkBox.isEnabled());
		System.out.println("Viaible : " + chkBox.isDisplayed());
		
		//if(chkBox.isSelected() == false)
		//if(chkBox.isSelected() != true)
		if(!chkBox.isSelected())
			chkBox.click();
		
		System.out.println("\nAfter Clicking...");
		System.out.println("Selected: " + chkBox.isSelected());
		System.out.println("Enabled : " + chkBox.isEnabled());
		System.out.println("Viaible : " + chkBox.isDisplayed());
		
		driver.close();
	}

}
