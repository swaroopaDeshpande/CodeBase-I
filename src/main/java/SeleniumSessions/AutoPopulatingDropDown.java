package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoPopulatingDropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://bioceptbetaweb.azurewebsites.net/Account/Login");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")))
				.sendKeys("ajay.kumar@technossus.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("Ajay@123");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-Login"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Place a New Order"))).click();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loaderDiv")));

		// this sleep is required because after invisibility of loader focus
		// goes to first input which is Requisition Number
		// If you are filling form from first input no need to for this sleep
		// if you want to input directly to client field need to sleep to avoid
		// focus first
		Thread.sleep(3000);

		WebElement client = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("client")));
		client.sendKeys("Ho");

		List<WebElement> dropdownOptions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
				By.xpath(".//div[label[text() = 'Client']]/ul[@class = 'typeahead dropdown-menu']//a")));
		dropdownOptions.get(0).click();

		WebElement facility = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facility")));
		facility.sendKeys("Ho");

		List<WebElement> facilityOptions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
				By.xpath(".//div[label[text() = 'Ordering Location']]/ul[@class = 'typeahead dropdown-menu']//a")));
		facilityOptions.get(0).click();
	}

}
