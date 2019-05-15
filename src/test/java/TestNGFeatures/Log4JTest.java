package TestNGFeatures;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Log4JTest {
	// what is log: capturing log/info at the time execution,what different
	// calls going on?
	// if u are running scripts on remote, you can monitor it from local machine
	// useful fo debugging purpose,file jar missing,null point exception etc
	// types of logs
	// 1.info
	// 2.warn
	// 3.error
	// 4.fatal
	// Apche log4J api
	// how it works?-->it reads log 4j configuration from log4j.properties file

	public static WebDriver driver;

	@BeforeTest
	public void TestDataSetup() {
		Logger logger = Logger.getLogger("Logger_File");
		PropertyConfigurator.configure("C:\\Users\\HP\\workspace\\CodeBase-I\\src\\main\\resources\\log4J.properties");
		logger.info("Issue Created with id \t");

	}

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
	}

	@Test
	public void freecrmTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "www.freecrm.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
