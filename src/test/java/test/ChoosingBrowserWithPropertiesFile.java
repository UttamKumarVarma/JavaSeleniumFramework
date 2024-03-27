package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AppPage;

public class ChoosingBrowserWithPropertiesFile {
	public static WebDriver driver = null;

	public static void main(String[] args) {

		String browserName = PropertiesFile.getProperties();
		// TODO Auto-generated method stub
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
		openGoogle();

	}

	public static void openGoogle() {
		AppPage appPage = new AppPage(driver);
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		appPage.enterText("Mr.Ukv");
		// Thread.sleep(5000);

	}

}
