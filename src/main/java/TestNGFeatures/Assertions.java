package TestNGFeatures;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	SoftAssert softassert = new SoftAssert();

	@Test
	public void loginTest() {
		System.out.println("Open Browser");
		// hard assertion:If any particular assertion fail all corrosponding
		// line in that test case won't be executed it mark as fail
		// browser is not opening ---good to put hard assert
		Assert.assertEquals(true, true);

		System.out.println("Enter Username");
		System.out.println("Enter password");
		System.out.println("Click on Signin Button");

		// login not working : put hard assert
		Assert.assertEquals(true, true);

		System.out.println("Validate Home page");
		// if home page title is missing not big issue then put soft assert
		softassert.assertEquals(true, false, "Home page titile is missing");// soft
																			// assert
																			// :
																			// program
																			// not
		// terminate, it will execute
		// next steps

		System.out.println("Go to deal page");
		System.out.println("create a deal");
		softassert.assertEquals(true, false, "Not able to create deal");

		System.out.println("Go to contact page");
		System.out.println("create a contact page");
		softassert.assertEquals(true, false, "not able to create contact");
		// // at end of the test case write this
		softassert.assertAll();

	}

	@Test
	public void HomePageTest() {

		System.out.println("Click on Home page");

		softassert.assertEquals(false, true, "Home page Test failing not able to create XYZ ");
		softassert.assertAll();

	}

	@Test
	public void logoutTest() {
		System.out.println("Click on Sign out link");
		softassert.assertEquals(true, false);
		softassert.assertAll();


	}

	// @AfterMethod
	// public void teardown()
	// {
	// softassert.assertAll();
	//
	// }

}
