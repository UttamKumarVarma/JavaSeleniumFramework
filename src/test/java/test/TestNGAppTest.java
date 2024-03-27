package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AppPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAppTest {
	
	public static WebDriver driver = null;
	
	
	@BeforeTest
	public void browserSetup() {
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();

				/*
				 * Other Browsers WebDriverManager.firefoxdriver().setup();
				 * WebDriverManager.operadriver().setup(); WebDriverManager.phantomjs().setup();
				 * WebDriverManager.edgedriver().setup(); WebDriverManager.iedriver().setup();
				 */

				driver = new ChromeDriver();
	}
	
	@Test
	public void test() {

		AppPage appPage = new AppPage(driver);
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		appPage.enterText("Mr.Ukv");
	}
	

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
}
