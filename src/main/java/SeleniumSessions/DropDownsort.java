package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownsort {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");

		WebElement Month=driver.findElement(By.name("slctMonth"));
		
		System.out.println(Month.getText());
		
		String DOB="10-May-2001";
		String dobArr[]=DOB.split("-");
		
		
		SelectValuefromdropdown(dobArr[1],Month);
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(""));
		

	}

	public static void SelectValuefromdropdown(String value, WebElement ele) {
		
		Select select=new Select (ele);
		List<WebElement> OptionsAvailable=select.getOptions();
		for(WebElement element: OptionsAvailable)
		{
			element.getText();
		}
		select.selectByVisibleText(value);
	}

}
