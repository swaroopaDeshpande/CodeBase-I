package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPracto {

	public static void main(String[] args) throws InterruptedException {
		// https://www.flipkart.com/

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement LoginLink=driver.findElement(By.linkText("Login & Signup"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click;",LoginLink );

		
		driver.findElement(By.xpath("//div[@class='_39M2dM']//input[@type='text']")).sendKeys("Test123@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[@class='_1avdGP']//button[@type='submit']")).click();
	}

}
