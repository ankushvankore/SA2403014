package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S07RediffRegistrion {
	WebDriver driver;
	
	@Given("Open Rediffmail")
	public void open_rediffmail() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	
	@When("I Enter {string} {string} and {string}")
	public void i_enter_and(String fullName, String rId, String ps) {
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys(fullName);
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys(rId);
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[9]/td[3]/input")).sendKeys(ps);
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[11]/td[3]/input")).sendKeys(ps);
		
	    driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
	}

	@Then("Approprite message should display")
	public void approprite_message_should_display() throws InterruptedException {
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font[1]/b")).getText());
	    
	    driver.close();
	}

}
