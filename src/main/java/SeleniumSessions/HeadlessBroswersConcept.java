package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBroswersConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxBinary FirefoxBinary = new FirefoxBinary();
		FirefoxBinary.addCommandLineOptions("--headless");

		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\Drivers\\FireFox_Driver\\geckodriver.exe");

		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(FirefoxBinary);

		WebDriver driver = new FirefoxDriver(fo);

		// WebDriver driver = new ChromeDriver();
		// WebDriver driver = new HTMLUnitDriver();

		// html unit driver is not avlb in 3.X version

//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");

		System.out.println("before logging title is" + driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("MangoD");
		driver.findElement(By.name("password")).sendKeys("Mangodolly");
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitBtn);

		System.out.println("After loging title" + driver.getTitle());

	}

}
