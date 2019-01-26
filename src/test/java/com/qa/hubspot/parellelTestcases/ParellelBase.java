package com.qa.hubspot.parellelTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ParellelBase {

	public WebDriver driver;

	@BeforeTest
	@Parameters("myBrowser")
	public void getBrowser(String myBrowser) {
		if (System.getProperty("osname").contains("Windows")) {
			if (myBrowser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			} else if (myBrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			}
		}
	}

	@AfterTest
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
