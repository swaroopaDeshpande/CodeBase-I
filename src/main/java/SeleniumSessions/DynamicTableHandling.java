package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicTableHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Drivers\\Cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("MangoD");
		driver.findElement(By.name("password")).sendKeys("Mangodolly");
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitBtn);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		
		contact.click();
//		String before_Xpath="//*[@id='vContactsForm']/table/tbody/tr[";
//		String after_Xpath="]/td[2]";
//		
//		for(int i=2;i<8;i++)
//		{
//			String name=driver.findElement(By.xpath(before_Xpath+i+after_Xpath)).getText();
//			System.out.println(name);
//			if(name.contains("test2 test1"))
//			{
//				//*[@id='vContactsForm']/table/tbody/tr[7]/td[1]/input
//				driver.findElement(By.xpath("[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
//			}
//		}
//		
		
		driver.findElement(By.xpath("//a[contains(text(),'swarup Deshpande')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
	}

}
