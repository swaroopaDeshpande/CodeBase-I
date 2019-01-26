package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(0, -2000));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/signup-v2/crm/step/join-hubspot-account");
		String title = driver.getTitle();
		System.out.println(title);
//		// locators
//		driver.findElement(By.id("uid-firstName-9")).sendKeys("Swaroopa");
//		driver.findElement(By.id("uid-lastName-11")).sendKeys("Deshpande");
//		driver.findElement(By.id("uid-email-13")).sendKeys("swarup.deshpande24@gmail.com");
//		driver.findElement(By.id("uid-password-15")).sendKeys("6860S@a$");
//		WebElement GetHubSpotBtn = driver.findElement(By.xpath("//div[contains(text(),'Get HubSpot CRM')]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", GetHubSpotBtn);
//		driver.findElement(By.id("uid-domain-21")).sendKeys("www.freecrm.com");
//		driver.findElement(By.id("uid-companyName-23")).sendKeys("Citi");
//		WebElement SaveBtn=driver.findElement(By.xpath("//div[contains(text(),'Save and continue')]"));
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();",SaveBtn );
	}

}
