package com.WebDriverDemos;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15LocateByTagName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links: " + links.size());
		
		//links.get(0) //Will return 1st link
		//System.out.println(links.get(0).getText());
		//System.out.println(links.get(1).getText());
		
		//for(int i = 0; i < links.size(); i++)
			//System.out.println(links.get(i).getText());
		
		/*for(datatype variable : collection)
		{
			
		}*/
		
		/*List<String> students = new ArrayList<>();
		for(String s : students) {
			
		}*/
		
		for(WebElement l : links)
			System.out.print(l.getText() + ", ");
		
		driver.close();
	}

}
