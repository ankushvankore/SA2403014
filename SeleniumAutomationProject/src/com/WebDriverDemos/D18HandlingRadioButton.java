package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D18HandlingRadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement genderF = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
		
		System.out.println("Before...");
		System.out.println("Selected: " + genderF.isSelected());
		System.out.println("Enabled : " + genderF.isEnabled());
		System.out.println("Visible : " + genderF.isDisplayed());
		
		genderF.click();
		
		System.out.println("\nAfter...");
		System.out.println("Selected: " + genderF.isSelected());
		System.out.println("Enabled : " + genderF.isEnabled());
		System.out.println("Visible : " + genderF.isDisplayed());
		
		//driver.close();
	}

}
