package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoVoice {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(op);

	}

}
