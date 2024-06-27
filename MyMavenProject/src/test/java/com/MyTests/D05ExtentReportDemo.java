package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D05ExtentReportDemo {

	public static void main(String[] args) {
		WebDriver driver;
		
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("MyFirstReport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlReport);
		ExtentTest test;
		
		//Add Env
		report.setSystemInfo("Machine Name", "Dell");
		report.setSystemInfo("Tester", "Ankush");
		report.setSystemInfo("OS", "Windows 11");
		report.setSystemInfo("Browser", "Google Chrome");
		
		//Configuration of Look and feel of report
		htmlReport.config().setDocumentTitle("My First Extent Report");
		htmlReport.config().setReportName("Google Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("EEEE MMM dd, yyyy HH:mm:ss");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		driver.close();
		
		test = report.createTest("Google Title");
		test.log(Status.PASS, MarkupHelper.createLabel("Google Title: Pass", ExtentColor.GREEN));
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Extent Report", Keys.ENTER);
		driver.close();
		
		test = report.createTest("Google Search");
		test.log(Status.PASS, MarkupHelper.createLabel("Google Search: Pass", ExtentColor.GREEN));
		
		report.flush();			//Generates the report
	}

}
