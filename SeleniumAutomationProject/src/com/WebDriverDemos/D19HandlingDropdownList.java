package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D19HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>countryList =  countries.getOptions();
		//List of all the countries in the drplist
		System.out.println("Total Countries: " + countryList.size());;
		
		/*int i = 0;
		for(WebElement country : countryList)
		{
			System.out.println(i + ". " + country.getText());
			i++;
		}*/
		
		//countries.selectByVisibleText("United States");
		//countries.selectByValue("222");
		countries.selectByIndex(219);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		//driver.close();
	}

}
