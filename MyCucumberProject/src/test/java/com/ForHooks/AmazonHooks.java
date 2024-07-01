package com.ForHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AmazonHooks {
	@Before
	public void openBrowser()
	{
		System.out.println("Opening Browser");
	}
	@After
	public void closeBrowser()
	{
		System.out.println("Closing browser");
	}
}
