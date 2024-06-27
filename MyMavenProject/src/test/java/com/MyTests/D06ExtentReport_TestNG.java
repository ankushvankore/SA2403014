package com.MyTests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class D06ExtentReport_TestNG {
	WebDriver driver;
	
	ExtentSparkReporter htmlReport;
	ExtentReports report;
	
	ExtentTest test;
	
	@Test(priority = 1)
	public void openOHRM() {
		test = report.createTest("Orange HRM Test");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Assert.assertTrue(driver.getTitle().contains("Orange"));
	}
	@Test(priority = 2)
	public void openGoogle() {
		test = report.createTest("Google Test");
		driver.get("https://www.google.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"));
	}
	@Test(priority = 3)
	public void openFacebook() {
		test = report.createTest("Facebook Test");
		driver.get("https://www.facebook.com/");
		
		throw new SkipException("Skipping this test");
	}
	
	@AfterMethod
	public void createReport(ITestResult result)
	{
		if(result.getStatus() == ITestResult.SUCCESS)
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		else if(result.getStatus() == ITestResult.FAILURE)
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		else if(result.getStatus() == ITestResult.SKIP)
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.YELLOW));
	}

	@BeforeTest
	public void beforeTest() {
		htmlReport = new ExtentSparkReporter("MyNewReport.html");
		report = new ExtentReports();
		report.attachReporter(htmlReport);
		
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
	}

	@AfterTest
	public void afterTest() {
		driver.close();
		report.flush();
	}

}
