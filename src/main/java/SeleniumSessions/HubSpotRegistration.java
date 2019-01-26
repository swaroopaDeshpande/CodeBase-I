package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HubSpotRegistration {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(
				"https://app.hubspot.com/signup-v2/crm/step/join-hubspot-account?gclid=Cj0KCQjwsMDeBRDMARIsAKrOP7EKikkTvxYqtIZapkBz4ynHWSjpTFJqVy8U2uzUlT_1gvWhSTPWtnEaArp7EALw_wcB&utm_campaign=CRM_Portals_EN_Adwords_APAC_SEA_T2_Brand-Terms_b_c_1468018251&utm_content=f030c&utm_expid=.qHMHJKxtQ2mKnhXJen3srQ.3&utm_id=280276348473&utm_medium=paid&utm_referrer=https%3A%2F%2Fwww.google.com%2F&utm_source=google&utm_term=crm_%2Bhubspot+%2Bcrm_EN");
		driver.findElement(By.id("uid-firstName-1")).sendKeys("Swar");
		driver.findElement(By.id("uid-lastName-3")).sendKeys("D");
		driver.findElement(By.id("uid-email-5")).sendKeys("SD2@gmail.com");
		driver.findElement(By.id("uid-password-7")).sendKeys("Test@1234");
		WebElement submitBtn = driver.findElement(By.xpath("//div[contains(text(),'Get HubSpot CRM')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].click();", submitBtn);
		
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.titleContains("Reports dashboard"));
//		
//		System.out.println("After logged in page title is "+driver.getTitle());

	}

}
