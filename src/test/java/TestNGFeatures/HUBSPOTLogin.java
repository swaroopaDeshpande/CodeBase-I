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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HUBSPOTLogin {

	WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new com.qa.hubspot.util.WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		driver.get("https://app.hubspot.com/login");

	}

	@Test
	public void verifyLoginPageTitleTest() {
		System.out.println("********verifyLoginPageTitleTest*********");
		String title = driver.getTitle();
		System.out.println("the login page title is: " + title);

		// if(title.equals("HubSpot LoginXX")){
		// System.out.println("PASS");
		// }else{
		// System.out.println("FAIL");
		// }
		Assert.assertEquals(title, "HubSpot Login", "title is not equal");
	}

	@Test
	public void verifyLoginButtonTest() {
		WebElement button = driver.findElement(By.id("loginBtn"));
		Assert.assertTrue(button.isDisplayed());
	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("swarup.deshpande24@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("loginBtn")).click();
//		WebElement modelPopup=driver.findElement(By.xpath("//div[@class='UIButtonWrapper__Wrapper-fCEHHA iCamXU']//button"));
//		Actions action = new Actions(driver);
//		action.moveToElement(modelPopup).build().perform();
//		modelPopup.click();


		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Reports dashboard"));

		String title = driver.getTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, "Reports dashboard");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
