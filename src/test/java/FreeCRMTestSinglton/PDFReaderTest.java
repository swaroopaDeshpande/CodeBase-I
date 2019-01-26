package FreeCRMTestSinglton;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFReaderTest {

	@Test
	public void readPDFTest() throws Exception {
		// System.setProperty("webdriver.chrome.driver",
		// "E:\\selenium\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		// driver.get("https://www.betterteam.com/downloads/employee-information-form-download-20170810.pdf");
		// driver.get(url);
		// String currentURL = driver.getCurrentUrl();
		// System.out.println(currentURL);
		URL url = new URL("file:///C:/Users/HP/Downloads/employee-information-form-download-20170810.pdf");
		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument document = null;
		document = PDDocument.load(fileParse);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		Assert.assertTrue(pdfContent.contains("Birth Date:"));
		Assert.assertTrue(pdfContent.contains("Spouse’s Name:"));
	}
}
