package com.qa.selenium.quickrecap.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	
	static WebDriver driver;

	public static void takeScreenshot(String filename) throws IOException {
		// 1.Take screenshot and store in file format
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy screenshot to desired location
		FileUtils.copyFile(file, new File("C:\\Users\\HP\\workspace\\CodeBase-I"+"src\\main\\java\\CodeBase-I"+filename+".png"));
	
	}

}
