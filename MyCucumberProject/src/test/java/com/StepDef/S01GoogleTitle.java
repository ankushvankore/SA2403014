package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S01GoogleTitle {
	WebDriver driver;
	String title;
	
	@Given("Open google")
	public void open_google() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("I Read title of the page")
	public void i_read_title_of_the_page() {
	    title = driver.getTitle();
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
	    System.out.println("Title: " + title);
	    
	    driver.close();
	}
}
