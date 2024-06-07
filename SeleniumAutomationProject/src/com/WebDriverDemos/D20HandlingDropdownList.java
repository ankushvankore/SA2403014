package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D20HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");

		WebElement listBox = driver.findElement(By.name("cars"));
		Select cars = new Select(listBox);

		List<WebElement> carList = cars.getOptions();
		for (WebElement c : carList)
			System.out.println(c.getText());

		if (cars.isMultiple()) {
			cars.selectByIndex(1);
			cars.selectByIndex(3);
			
			List<WebElement>selectedCars = cars.getAllSelectedOptions();
			
			System.out.println("\nSelected Cars...");
			for(WebElement sc : selectedCars)
				System.out.println(sc.getText());
		}
		driver.close();
	}

}
