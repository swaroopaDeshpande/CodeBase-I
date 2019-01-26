package SeleniumSessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("MangoD");
		driver.findElement(By.name("password")).sendKeys("Mangodolly");
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitBtn);

		driver.switchTo().frame("mainpanel");
		// driver.findElement(By.xpath("//a[contains(text(),'Calendar')]")).click();

		String date = "0-December-2018";
		String DateArray[] = date.split("-");// {24,December,2018}
		String day = DateArray[0];
		String month = DateArray[1];
		String year = DateArray[2];

		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);

		String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";

		final int totalWeekDays = 7;
		boolean flag = false;
		String dayVal = null;

		for (int row = 2; row <= 7; row++) {

			for (int col = 1; col <= totalWeekDays; col++) {

				try {
					dayVal = driver.findElement(By.xpath(beforeXpath + row + afterXpath + col + "]")).getText();
				} catch (NoSuchElementException e) {
					System.out.println("Please enter a correct date value");
					flag=false;
					break;
				}
				System.out.println(dayVal);
				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(beforeXpath + row + afterXpath + col + "]")).click();
					flag = true;
					break;
				}
				if (flag == true) {
					break;
				}
			}
		}
	}

}
