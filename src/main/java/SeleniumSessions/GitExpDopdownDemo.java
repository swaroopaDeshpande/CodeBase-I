package SeleniumSessions;

import java.util.List;

import org.dom4j.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitExpDopdownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/workspace/CodeBase-I/src/main/java/driverexes/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gitexplorer.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement drop=driver.findElement(By.cssSelector(".css-1hwfws3"));
//		System.out.println(drop.getAttribute("innerHTML"));
		drop.click();
		
		List<WebElement>list=driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		
	}

}
