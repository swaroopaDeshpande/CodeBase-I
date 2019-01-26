package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/register/");

		WebElement submitBtn = driver.findElement(By.id("submitButton"));
		boolean flag_displayed = submitBtn.isDisplayed();
		System.out.println(flag_displayed);

		boolean flag_Enabled = submitBtn.isEnabled();
		System.out.println(flag_Enabled);

		boolean flg_selected = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flg_selected);
		
	}

}
