package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://makemysushi.com/Recipes/how-to-make-california-sushi-rolls");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of all links and images" + linksList.size());

		List<WebElement> activelinks = new ArrayList<WebElement>();// filter
																	// having
																	// only
																	// those
																	// links
																	// having
																	// href
																	// property

		// iterate :exclude all links and images which doensot have any href
		// attribute
		for (int i = 0; i < linksList.size(); i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			if (linksList.get(i).getAttribute("href") != null && (! linksList.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(linksList.get(i));
			}
		}

		// get size of active links
		System.out.println("size of active links and images" + activelinks.size());

		// check the href url with httpconnectionapi
		for (int j = 0; j < activelinks.size(); j++) {

			HttpURLConnection Connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href"))
					.openConnection();
			Connection.connect();
			String response = Connection.getResponseMessage();
			Connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href") + "---->" + response);
		}

	}
}
