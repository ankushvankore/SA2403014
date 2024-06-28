package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03OHRM_Login {
	WebDriver driver;
	
	@Given("I Open OHRM")
	public void i_open_ohrm() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
//	@Given("Open Orange HRM")
//	public void open_orange_hrm() {
//		driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}

	@When("Enter valid username as {string} and valid password as {string}")
	public void enter_valid_username_as_and_valid_password_as(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	}
	
	@When("Enter valid username and valid password")
	public void enter_valid_username_and_valid_password() {
	    
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("Login should successful")
	public void login_should_successful() {
	    if(driver.getCurrentUrl().contains("dash"))
	    	System.out.println("Login Succss");
	    else
	    	System.out.println("Login fail");
	    
	    driver.close();
	}

//	@Given("Open Orange HRM in browser")
//	public void open_orange_hrm_in_browser() {
//		driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}

	@When("Enter invalid username as {string} and invalid password as {string}")
	public void enter_invalid_username_as_and_invalid_password_as(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	}
	
	@When("Enter invalid username and invalid password")
	public void enter_invalid_username_and_invalid_password() {
		
	}

	@When("I Click on login button")
	public void i_click_on_login_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
	    System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
	    
	    driver.close();
	}
}
