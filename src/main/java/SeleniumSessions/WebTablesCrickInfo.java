package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesCrickInfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.espncricinfo.com/series/8890/game/1156836/andhra-vs-odisha-elite-group-b-vijay-hazare-trophy-2018-19");
		String BeforeXpath="//*[@id='main-container']/div/div[3]/div[1]/article/div/table/tbody[1]/tr[";
		String afterXpath="]/td[1]";
		List<WebElement> Row=driver.findElements(By.xpath("//table[@id='main-container']/div/div[3]/div[1]/article/div/table/tbody[1]/tr[1]/td[1]"));
		int rowCount=Row.size();
		System.out.println("No of rows are"+rowCount);
	}

}
