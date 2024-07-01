package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04GoogleLinks {
	WebDriver driver;

	@Given("Open Google for Testing Links")
	public void open_google_for_testing_links() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
	}

	@When("Click on Gmail Link")
	public void click_on_gmail_link() {
		driver.findElement(By.partialLinkText("Gmail")).click();
	}

	@Then("Gmail page should display")
	public void gmail_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Gmail"));
		driver.close();
	}

	@When("Click on Images Link")
	public void click_on_images_link() {
		driver.findElement(By.partialLinkText("Images")).click();
	}

	@Then("Images page should display")
	public void images_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Images"));

		driver.close();
	}

	@When("Click on About Link")
	public void click_on_about_link() {
		driver.findElement(By.partialLinkText("About")).click();
	}

	@Then("About page should display")
	public void about_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("About"));

		driver.close();
	}

	@When("Click on Advt Link")
	public void click_on_advt_link() {
		driver.findElement(By.partialLinkText("Adve")).click();
	}

	@Then("Advt Page should display")
	public void advt_page_should_display() {
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Ads"));

		driver.close();
	}
}
