package TestNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import com.qa.hubspot.util.*;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * launch browser deleteAllCookies enter url
 * 
 * login to app Testcase1 logout
 * 
 * login to app Testcase2 logout
 * 
 * login to app Testrcase3 logout
 * 
 * deleteUser closeDBConnection close browser
 */

public class TestNGBasicsTest {

	WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;

	@BeforeSuite
	public void launchBrowser() {
		System.out.println("launch browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(com.qa.hubspot.util.Constants.page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new com.qa.hubspot.util.WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
	}

	@BeforeTest
	public void deleteCookies() {
		System.out.println("deleteAllCookies");
		driver.manage().deleteAllCookies();
	}

	@BeforeClass
	public void enterUrl() {
		System.out.println("enter url");
		driver.get(com.qa.hubspot.util.Constants.url);
	}

	@BeforeMethod
	public void login() {
		System.out.println("login to app");

	}

	@Test(priority = 1, enabled = false)
	public void verifyLoginPageTitleTest() {
		System.out.println("********verifyLoginPageTitleTest*********");
		String title = driver.getTitle();
		System.out.println("the login page title is: " + title);
		Assert.assertEquals(title, "HubSpot Login", "title is not equal");
	}

	@Test(priority = 2, enabled = false,dependsOnMethods="loginTest")
	public void verifyLoginButtonTest() {
		WebElement button = driver.findElement(By.id("loginBtn"));
		Assert.assertTrue(button.isDisplayed());
	}

	@Test(priority = 3)
	public void loginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("swarup.deshpande24@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		WebElement ModelPopup = driver
				.findElement(By.xpath("//div[@class='uiDialogBody private-modal__body has--vertical-spacing']"));
		WebElement button = driver.findElement(By.xpath(
				"//button[@class='uiButton private-button private-button--default private-button--primary private-button--non-link']"));
		Actions action=new Actions(driver);
		action.click(button);
		WebDriverWait wait = new WebDriverWait(driver, com.qa.hubspot.util.Constants.defaultExplicitewait_Timeout);
		wait.until(ExpectedConditions.titleContains("Getting Started | HubSpot"));

		String title = driver.getTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, "Getting Started | HubSpot");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");
		WebElement logoutLink = driver.findElement(By.xpath("//a//span[contains(text(),'Citi')]"));
		WebElement SignOut = driver.findElement(By.linkText("Sign out"));
		Actions action = new Actions(driver);
		action.moveToElement(logoutLink).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, com.qa.hubspot.util.Constants.defaultExplicitewait_Timeout);
		wait.until(ExpectedConditions.visibilityOf(logoutLink));
		WebDriverWait wait1 = new WebDriverWait(driver, com.qa.hubspot.util.Constants.defaultExplicitewait_Timeout);
		wait1.until(ExpectedConditions.visibilityOf(SignOut));

		SignOut.click();
	}

	@AfterClass
	public void deleteUser() {
		System.out.println("deleteUser");
	}

	@AfterTest
	public void closeDBConnection() {
		System.out.println("closeDBConnection");
	}

	@AfterSuite
	public void closeBrowser() {
		System.out.println("close browser");
		driver.close();
	}

}
