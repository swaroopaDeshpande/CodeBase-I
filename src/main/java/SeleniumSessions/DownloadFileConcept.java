package SeleniumSessions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import static org.hamcrest.MatcherAssert.assertThat;


public class DownloadFileConcept {

	static WebDriver driver;
	static File folder;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();

		// chrome
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		// click on link no popup for download
		prefs.put("profile.default_content_settings.popups", 0);
		// default download directory
		prefs.put("download.default_directory", folder.getAbsolutePath());

		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(cap);
		
		downloadFileTest();
		driver.quit();
		// iterate from that folder created and then delete
		for (File file : folder.listFiles()) {
			file.delete();
		}
		folder.delete();

	}

	public static void downloadFileTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.cssSelector(".example a")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		File listoffiles[]=folder.listFiles();
		//make sure directory is not empty not avilable in hamcrest 
		//Assert.assertEquals(listoffiles.length, is(not(0)));
		Assert.assertTrue(listoffiles.length>0);
		

	}

}
