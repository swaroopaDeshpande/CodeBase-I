package TestNGFeatures;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 @BeforeSuite
 @BeforeTest
 @BeforeClass
 @BeforeMethod
 @Test1
 @AfterMethod
 @BeforeMethod
 @Test2
 @AfterMethod
 @AfterClass
 @AfterTest
 @AfterSuite
 */
public class AnnotationsRealLifeExample {
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.out.println("Setup System properties for Broswer");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching Chrome browser");
		driver = new ChromeDriver();
	}

	@BeforeClass
	public void SetupTimeouts() {
		System.out.println("setup related to timeouts and maximize window");
		driver.get("http://practice.automationtesting.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().getCookies();

	}

	@BeforeMethod
	public void loginURL() {
		driver.get("http://practice.automationtesting.in");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("username")).sendKeys("swarup.deshpande24@gmail.com");
		driver.findElement(By.id("password")).sendKeys("swardeshpande");
		driver.findElement(By.xpath("//input[@type='submit' and @name='login']")).click();
	}

	@Test(priority = 1)
	public void HomePageSlidersTest() {
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("Home")).click();
		List<WebElement> slides = driver
				.findElements(By.xpath("//div[@id='n2-ss-6-align']//div[contains(@class,'n2-ss-slider-')]"));
		int noOfslides = slides.size();
		System.out.println("Total No of slides are" + noOfslides);
		Assert.assertEquals(noOfslides, 3);
	}

	@Test(priority = 2)
	public void arrivalHomePageTest() {
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("Home")).click();
		List<WebElement> arrivals = driver.findElements(By.xpath(
				"//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']//div[contains(@class,'col3')]"));
		int noOfArrivals = arrivals.size();
		System.out.println(noOfArrivals);
		Assert.assertEquals(noOfArrivals, 3);
	}

	@Test(priority = 3)
	public void NavigationTest() {
		System.out.println("Click on images and check navigation functionality");
	}

	@AfterMethod
	public void CheckingLogs() {
		System.out.println("Logs check task");
		Logs log = driver.manage().logs();
		System.out.println(log.get(LogType.BROWSER));
	}

	@AfterClass
	public void logout() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Quitting browser");
		driver.close();
	}

	@AfterSuite
	public void deleteAllCookies() {
		System.out.println("Deleting All cookies of session");
		driver.manage().deleteAllCookies();
	}

}
