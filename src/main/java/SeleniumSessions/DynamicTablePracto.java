package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablePracto {

	public static void main(String[] args) {
		//1 way: get rows and columns and use for loops
		//2.dynamic xpath
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		
		
		
		
		
	}
}
