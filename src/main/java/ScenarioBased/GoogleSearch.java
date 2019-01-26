package ScenarioBased;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
		List<WebElement> options = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("No of suggestions in search box : " + options.size());

		for (int i = 0; i < options.size(); i++) {
			String optionText = options.get(i).getText();
			System.out.println(optionText);
			if(optionText.equals("testing tools"))
			{
				System.out.println("You Have selected the option : "+options.get(i).getText());
				options.get(i).click();
				break;
			}
		}
		
	
	}
}
