package com.qa.hubspot.parellelTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParellelTestcases {

	public WebDriver driver;

	@BeforeTest
	@Parameters("myBrowser")
	public void getBrowser(String myBrowser) {
			if (myBrowser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "E:\\selenium\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (myBrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
	

	@Test
	public void ebayPageTitleTestParellelModeOn() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		String title = driver.getTitle();
		System.out.println(title);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains(title));
	}

	@AfterTest
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
