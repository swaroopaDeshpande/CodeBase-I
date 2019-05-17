package ParellelTestingUsingLambdaTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestLambada {
	{
	
	WebDriver driver = null;
	String baseUrl ;
	String nodeUrl ;
	
	baseUrl = "https://www.facebook.com";
	nodeUrl = "http://192.168.10.21:5568/wd/hub";

	DesiredCapabilities capability = DesiredCapabilities.firefox();
	capability.setBrowserName("firefox");
	capability.setPlatform(Platform.WIN8_1);

	try {
		driver = new RemoteWebDriver(new URL(nodeUrl),capability);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
}

}
