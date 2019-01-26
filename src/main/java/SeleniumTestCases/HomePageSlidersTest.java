package SeleniumTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePageSlidersTest {

	public static void main(String[] args) {
		// http://practice.automationtesting.in/

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/");
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("Home")).click();
		List<WebElement> slides=driver.findElements(By.xpath("//div[@id='n2-ss-6-align']//div[contains(@class,'n2-ss-slider-')]"));
		int noOfslides=slides.size();
		System.out.println("Total No of slides are"+noOfslides);
		Assert.assertEquals(noOfslides, 3);	
	}

}
