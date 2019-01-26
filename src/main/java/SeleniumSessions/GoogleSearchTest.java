package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @title='Search']")).sendKeys("Testing");
		List<WebElement> Suggestions = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']//span"));
		System.out.println("Total Number of suggestions : " + Suggestions.size());

		Suggestions = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']//span"));
		
		for (int i = 0; i < Suggestions.size(); i++) {

			

			System.out.println(Suggestions.get(i).getText());

			if (Suggestions.get(i).getText().contains("Software Testing"))

				Suggestions.get(i).click();
			break;

		}
	}

}
