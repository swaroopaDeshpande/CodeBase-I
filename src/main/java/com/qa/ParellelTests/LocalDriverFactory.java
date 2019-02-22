package com.qa.ParellelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class LocalDriverFactory {
	static WebDriver createInstance(String browserName) {
		WebDriver driver = null;
		if (browserName.toLowerCase().contains("firefox")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			return driver;
		}
		if (browserName.toLowerCase().contains("internet")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\InterbetExplorer.exe");
			driver = new InternetExplorerDriver();
			return driver;
		}
		if (browserName.toLowerCase().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		}
		return driver;
	}

}
