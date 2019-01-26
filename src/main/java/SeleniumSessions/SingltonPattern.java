package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingltonPattern {

	public static WebDriver driver = null;

	public static void init() {
		//singlton pattern : need to initialize driver only once
		if (driver == null) {
			if (com.qa.hubspot.util.Constants.browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\Cromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (com.qa.hubspot.util.Constants.browserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\FireFox_Driver\\geckodriver.exe");
				driver = new ChromeDriver();
			}
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(com.qa.hubspot.util.Constants.url);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript ("window.scrollTo (0, document.body.scrollHeight)");
	}

	public static void quit() {
		System.out.println("Quitting browser");
		driver.quit();
		driver = null;
	}

	public static void close() {
		System.out.println("Close browser");
		driver.close();
		driver = null;
	}

}
