package test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class RecordedFromKatalon {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private JavascriptExecutor js;

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		/*
		 * Other Browsers WebDriverManager.firefoxdriver().setup();
		 * WebDriverManager.operadriver().setup(); WebDriverManager.phantomjs().setup();
		 * WebDriverManager.edgedriver().setup(); WebDriverManager.iedriver().setup();
		 */

		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void test1() throws Exception {
		driver.get(
				"https://www.google.com/search?q=Mr.Uttam+Kumar+Varma&oq=Mr.Uttam+Kumar+Varma&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCjExNzU2ajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
