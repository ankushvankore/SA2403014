package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04EchotrakPlaceholderValues {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		List<WebElement>textBoxes =  driver.findElements(By.className("form-control"));
		
		//System.out.println(textBoxes.get(0).getAttribute("placeholder"));
		//System.out.println(textBoxes.get(1).getAttribute("placeholder"));
		
		for(WebElement tb : textBoxes)
			System.out.println(tb.getAttribute("placeholder"));
		
		driver.close();
	}

}
