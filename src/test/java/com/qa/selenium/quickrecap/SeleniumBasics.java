package com.qa.selenium.quickrecap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hubspot.util.Constants;

public class SeleniumBasics {
	WebDriver driver;

	@BeforeMethod
	public void setUp()

	{
		System.setProperty("webdriver.chrome.driver", Constants.exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.page_Load_TimeOut, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

	}

	@Test
	public void loginTest() {
		
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
