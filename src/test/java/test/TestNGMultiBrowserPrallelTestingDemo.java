package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserPrallelTestingDemo {
	public static WebDriver driver = null;
	//String browserName = PropertiesFile.getProperties();

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			// edge driver
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	@Test
	public void test() {
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Mr.Ukv");
	}

	@AfterTest
	public void teardown() {
		//driver.close();
		//driver.quit();
	}
}
