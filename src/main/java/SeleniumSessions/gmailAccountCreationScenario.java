package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccountCreationScenario {

	public static void main(String[] args) {
		// https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail&hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get(
				" https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail&hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.findElement(By.id("firstName")).sendKeys("Goga001");
		driver.findElement(By.id("lastName")).sendKeys("Raju");
		driver.findElement(By.id("username")).sendKeys("GROAGJAU001");
		driver.findElement(By.name("Passwd")).sendKeys("Test@123");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Test@123");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.id("phoneNumberId")).sendKeys("9881609217");
		driver.findElement(By
				.xpath("//div//input[@type='text' and @class='whsOnd zHQkBf' and @aria-label='Recovery email address (optional)']"))
				.sendKeys("amey.palkar@gmail.com");
	}

}
