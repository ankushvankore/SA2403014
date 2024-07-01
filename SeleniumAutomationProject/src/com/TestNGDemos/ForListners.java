package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

@Listeners(com.TestNGDemos.MyListners.class)
public class ForListners {
	
	@Test
	public void tc1() {
		System.out.println("TC1");
		Assert.assertTrue("Ankush".contains("vankore"));
	}
	@Test
	public void tc2() {
		System.out.println("TC2");
		Assert.assertTrue("Ankush".contains("Ankush"));
	}
	@Test
	public void tc3() {
		System.out.println("TC3");
		throw new SkipException("Skipping");
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
