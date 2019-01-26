package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class DynamicWebTablePracto {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");

		driver.findElement(By.name("username")).sendKeys("MangoD");
		driver.findElement(By.name("password")).sendKeys("MangoDolly");

//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		// js.executeScript("argument[0],click;", );

		driver.switchTo().frame("intercom-borderless-frame");
		WebElement Chat = driver.findElement(By.xpath(
				"//div[@class='intercom-chat-card intercom-chat-card-borderless intercom-chat-card-with-avatar']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(Chat).build().perform();
		driver.findElement(By.xpath("//div[@class='intercom-borderless-dismiss-button']")).click();

		driver.switchTo().frame("mainpanel");
		WebElement ContactsLink = driver.findElement(By.linkText("Contacts"));
		Actions action = new Actions(driver);
		action.moveToElement(ContactsLink).build().perform();
		driver.findElement(By.linkText("New Contact")).click();
		driver.findElement(By.id("first_name")).sendKeys("Admin");
		driver.findElement(By.id("surname")).sendKeys("Admin123");	
	}

}
