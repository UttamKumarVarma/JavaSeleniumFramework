package test;

import pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	public static void main(String[] args) {

		WebDriver driver = null;

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		/*
		 * Other Browsers WebDriverManager.firefoxdriver().setup();
		 * WebDriverManager.operadriver().setup(); WebDriverManager.phantomjs().setup();
		 * WebDriverManager.edgedriver().setup(); WebDriverManager.iedriver().setup();
		 */

		driver = new ChromeDriver();

		AppPage appPage = new AppPage(driver);
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		appPage.enterText("Mr.Ukv");
	}

}
