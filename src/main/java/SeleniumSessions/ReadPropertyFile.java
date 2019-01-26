package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertyFile {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\HP\\workspace\\CompleteInterViewPracto\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		String URL = prop.getProperty("url");
		System.out.println(URL);
		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		if (browsername.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\gecko.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\InternetExplorer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(URL);
	}

}
