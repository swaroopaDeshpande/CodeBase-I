package com.qa.selenium.quickrecap;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hubspot.util.Constants;
import com.qa.selenium.quickrecap.Util.TestUtil;

public class ScreenShotPracto {
	
	static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException

	{
		System.setProperty("webdriver.chrome.driver", Constants.exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.page_Load_TimeOut, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

	}

	@Test
	public static void loginTest() throws IOException {
		
		String title= driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google");
		
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
