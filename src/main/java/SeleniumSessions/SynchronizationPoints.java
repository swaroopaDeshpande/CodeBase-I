package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationPoints {

	public static void main(String[] args) {
		// Explicte wait

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("ABC");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("XYZ");
		WebElement forgotAccount = driver.findElement(By.linkText("Forgotten account?"));
		forgotAccount.click();
		clickOn(driver, 40, firstName);
		clickOn(driver, 40, lastName);
		clickOn(driver, 30, forgotAccount);

	}

	public static void clickOn(WebDriver driver, int timeout, WebElement element) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

}
