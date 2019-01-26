package SeleniumTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ArrivalsHomePageTest {

	public static void main(String[] args) {
		//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']//div[contains(@class,'col3')]
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/");
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("Home")).click();
		List<WebElement> arrivals=driver.findElements(By.xpath("//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']//div[contains(@class,'col3')]"));
		int noOfArrivals=arrivals.size();
		System.out.println(noOfArrivals);
		Assert.assertEquals(noOfArrivals, 3);
	}

}
