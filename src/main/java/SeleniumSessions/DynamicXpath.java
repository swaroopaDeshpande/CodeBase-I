package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("MangoD");
		driver.findElement(By.name("password")).sendKeys("MangoDolly");
		WebElement submitBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitBtn);

		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		WebElement textOption = driver.findElement(By.xpath("// a[contains(text(),'Text/SMS') and @title='Text/SMS']"));
		action.moveToElement(textOption).build().perform();
		driver.findElement(By.xpath("a[contains(text(),'New Text/SMS Campaign') and @title='New Text/SMSCampaign']"))
				.click();
		String text = driver
				.findElement(By
						.xpath("//div[@class='alertMessage' and contains(text(),'This feature is not available for Free account. Please upgrade to pro account.')]"))
				.getText();
		System.out.println(text);

	}
}
