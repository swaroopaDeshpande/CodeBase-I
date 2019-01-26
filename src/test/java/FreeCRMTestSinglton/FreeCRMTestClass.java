package FreeCRMTestSinglton;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SeleniumSessions.SingltonPattern;

public class FreeCRMTestClass {

	@BeforeMethod
	public void setUp() {
		SingltonPattern.init();
	}

	@Test
	public void verifyFreeCRMTitle() {
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
