package FreeCRMTestSinglton;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SeleniumSessions.SingltonPattern;

public class FreeCRMTestClass {
	
	Logger log=Logger.getLogger(FreeCRMTestClass.class);

	@BeforeMethod
	public void setUp() {
		SingltonPattern.init();
	}

	@Test
	public void verifyFreeCRMTitle() {
		log.info(log);
		String title = SingltonPattern.driver.getTitle();
		System.out.println("Page Title is " + title);
		Assert.assertEquals(title, com.qa.hubspot.util.Constants.loginPageTitle);
	}

	@Test
	public void logoTest() {
		Assert.assertTrue(SingltonPattern.driver.findElement(By.className("img-responsive")).isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		SingltonPattern.close();
	}
}
