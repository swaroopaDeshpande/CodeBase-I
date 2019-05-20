package com.qa.selenium.quickrecap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsClassTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\Drivers\\FireFox_Driver\\geckodriver.exe");
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(firefoxBinary);
		driver = new FirefoxDriver(fo);
		driver.get("http://www.facebook.com");

	}

	@Test
	public void actionclassTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}



}
