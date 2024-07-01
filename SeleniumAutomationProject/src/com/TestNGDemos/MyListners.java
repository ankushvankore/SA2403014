package com.TestNGDemos;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener
{
	public void onStart(ITestContext result)
	{
		System.out.println("Execution Started");
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("Execution Ended");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Execution Fail");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Execution Skiped");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Success");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}
}
