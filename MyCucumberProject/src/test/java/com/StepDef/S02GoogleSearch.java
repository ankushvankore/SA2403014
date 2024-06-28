package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	WebDriver driver;
	
	@Given("Open google app")
	public void open_google_app() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("Enter valid keyword in Searchbox")
	public void enter_valid_keyword_in_searchbox() {
	    driver.findElement(By.name("q")).sendKeys("Cucumber Framework");
	}

	@When("I hit enter")
	public void i_hit_enter() {
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Search result should display")
	public void search_result_should_display() {
	    if(driver.getTitle().contains("Cucumber"))
	    	System.out.println("Valid search result displayed");
	    else
	    	System.out.println("Invalid search result displayed");
	    
	    driver.close();
	}
}
